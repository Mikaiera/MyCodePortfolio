public class Staff extends Employee{

	private String title;
	
	public Staff(){
		this("11112222", "John Allen", "Prof", "G4-202", "11112222@mynwu.ac.za");
	}
	
	public Staff(String id ,String name, String title , String office ,String email){
		super(id,name,email,office);
		setTitle(title);
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public String toString(){
		return "The object is. ID: " + getId() + " ,Name: " + getName() + " ,Title: " + getTitle() + " ,Office: " + getOffice() + " , Email: " + getEmail();
	}
}