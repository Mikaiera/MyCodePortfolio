public class Employee extends Person{//It is a superclass hence it extends person(It is a subclass of it) but it is the super class of faculty and staff

	private String office;
	
	public Employee(){
		this("00000000","FNAS","G4-204","00000000@mynwu.ac.za");
	}
	
	public Employee(String id, String name,String office, String email){
		super(id,name,email);
		setOffice(office);
	}

	public void setOffice(String office){
		this.office = office;
	}
	

	public String getOffice(){
		return office;
	}

	
	public String toString(){
		return "The object is. ID: " + getId() + " ,Name: " + getName() + " ,Office: " + getOffice() + " , Email: " + getEmail();
	}
}