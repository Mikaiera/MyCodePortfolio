public class InvalidRadiusException extends RuntimeException {
    public InvalidRadiusException(){
        this("This is invalid");
    }

    public InvalidRadiusException(String m){
        super(m);
    }

}
