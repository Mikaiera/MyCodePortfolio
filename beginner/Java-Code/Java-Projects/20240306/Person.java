public class Person{
	private String id;
	private String name;
	private String email;
	
	public Person(){
		this("44834624", "Mekayla Moyikwa", "44834624@mynwu.ac.za");
	}
	
	public Person (String id, String name ,String email){
		setId(id);
		setName(name);
		setEmail(email);
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public void setName(String name){
		this.name = name;
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
	
	public String getEmail(){
		return email;
	}
	
	public String toString(){
		return "The objects is : ID " + getId() + " , Name: " + getName() + " , Email: " + getEmail();
	}
}