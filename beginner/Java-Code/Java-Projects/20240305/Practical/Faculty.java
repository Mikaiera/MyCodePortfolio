public class Faculty{
	
	private String id;
	private String name;
	private String rank;
	private String office;
	private String email;
	
	public Faculty(){
		this("00000000","FNAS","1","G4-204","00000000@mynwu.ac.za");
	}
	
	public Faculty(String id, String name, String rank ,String office, String email){
		setId(id);
		setName(name);
		setRank(rank);
		setOffice(office);
		setEmail(email);
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setRank(String rank){
		this.rank = rank;
	}
	
	public void setOffice(String office){
		this.office = office;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public String getRank(){
		return rank;
	}
	
	public String getOffice(){
		return office;
	}
	
	public String getEmail(){
		return email;
	}
	
	public String toString(){
		return "The object is. ID: " + getId() + " ,Name: " + getName() + " ,Rank: " + getRank() + " ,Office: " + getOffice() + " , Email: " + getEmail();
	}
}