public class Faculty extends Employee{

	private String rank;

	public Faculty(){
		this("00000000","FNAS","Prof","00000000@mynwu.ac.za", "G4-204");
	}
	
	public Faculty (String id, String name, String rank,String email, String office){
		super(id,name,email,office); //this is not necessary here because this not directly connected to the superclass its connected to employee which is connected to the superclass
		setRank(rank);
	}

	public void setRank(String rank){
		this.rank = rank;
	}

	public String getRank(){
		return rank;
	}

	public String toString(){
		return "The object is. ID: " + getId() + " ,Name: " + getName() + " ,Rank: " + getRank() +" , Email: " + getEmail() + ", Office" + getOffice();
	}
}