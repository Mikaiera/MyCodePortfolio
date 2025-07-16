public class Staff{
	private String id;
	private String name;
	private String title;
	private String office;
	private String email;
	
	public Staff(){
		this("11112222", "John Allen", "Prof", "G4-202", "11112222@mynwu.ac.za");
	}
	
	public Staff(String id ,String name, String title , String office ,String email){
		setId(id);
		setName(name);
		setTitle(title);
		setOffice(office);
		setEmail(email);
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setTitle(String title){
		this.title = title;
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
	
	public String getTitle(){
		return title;
	}
	
	public String getOffice(){
		return office;
	}
	
	public String getEmail(){
		return email;
	}
	
	public String toString(){
		return "The object is. ID: " + getId() + " ,Name: " + getName() + " ,Title: " + getTitle() + " ,Office: " + getOffice() + " , Email: " + getEmail();
	}
}