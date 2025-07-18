import React from 'react'
import { Search } from './components/Search'
import Loading from './components/Loading';
import { useEffect, useState } from 'react'
import MovieCard from './components/MovieCard';
import { useDebounce } from 'react-use'
import { getTrendingMovies, updateSearchCount } from './appwrite.js';

const API_BASE_URL = 'https://api.themoviedb.org/3';//api 
const API_KEY = import.meta.env.VITE_TMDB_API_KEY; //Personal Api key

const API_OPTIONS = {
  method: 'GET',
  headers: {
    accept: 'application/json',
    Authorization: `Bearer ${API_KEY}`
  }
}

const App = () => {
  const [searchTerm, setSearchTerm] = useState("");

  const [errorMessage, setErrorMessage] = useState("");
  const [movieList, setMovieList] = useState([]);
  const [trendingMovies, setTrendingMovies] = useState([]);
  const [isLoading, setIsLoading] = useState(false);

  const [debouncedSearchTerm, setDebouncedSearchTerm] = useState('');

  // This is used to set a delay inbetween the api fetches and returns and waits for the user to stop typing before it returns the result
  useDebounce(() => setDebouncedSearchTerm(searchTerm), 500, [searchTerm] )

  const fetchMovies = async(query = '') =>{
    setIsLoading(true);
    setErrorMessage('');

    try{
      //Process for searching a movie
      const endpoint = query 
      ? `${API_BASE_URL}/search/movie?query=${encodeURIComponent(query)}`
      : `${API_BASE_URL}/discover/movie?sort_by=popularity.desc`;

      const response = await fetch (endpoint, API_OPTIONS);

      if(!response.ok){
        throw new Error('Failed to fetch movies');
      }

      const data = await response.json();

      if(data.Response === 'False'){
        setErrorMessage(data.Error || 'Failed to fetch movies');
        setMovieList([]);
        return;
      }
      setMovieList(data.results || []);

      if(query && data.results.length > 0){
        await updateSearchCount(query, data.results[0]);
      }
    }catch (error){
      console.error(`Error Fetching Movies: ${error}`);
      setErrorMessage('There has been a error fetching movies. Please try again later.');
    }finally{
      setIsLoading(false)
    }
  };

  const loadTrendingMovies = async () =>{
    try{
      const movies = await getTrendingMovies();

      setTrendingMovies(movies);
    }catch (error){
      console.error(`Error fetching trending movies: ${error}`);
    }
  }

  useEffect(() => {
    fetchMovies(debouncedSearchTerm)
  },[debouncedSearchTerm]);

  useEffect (() =>{
    loadTrendingMovies();
  }, []);

  return (
    <main>
      <div className="pattern"/>

      <div className="wrapper">
        <header>
          <h1>CineTrack</h1>
          <img src="./hero-img.png" alt="Banner Movie posters" />
          <h1>Find Your Next <span className='text-gradient'> Watch </span> & Enjoy</h1>
          
          <Search searchTerm={searchTerm} setSearchTerm={setSearchTerm} />
        </header>

        {trendingMovies.length > 0  && (
          <section className='trending'>
            <h2>Top Searches </h2>

            <ul>
              {trendingMovies.map((movie, index) =>(
                <li key={`${movie.id}` || index}>
                  <p>{index + 1}</p>
                  <img src={movie.poster_url} alt={movie.title} />
                </li>
              ))}
            </ul>
          </section>
        )}

        <section className='all-movies'>
          <h2>Currently Popular</h2>

          {isLoading ? (
            <Loading/>
          ) : errorMessage ? (
              <p className='text-red-500'>{errorMessage}</p>
          ) : (
            <ul>
              {movieList.map((movie) => (
                <MovieCard key={movie.id} movie={movie}/>
              ))}
            </ul>
          )};

        </section>
      </div>
    </main>
  )
}

export default App