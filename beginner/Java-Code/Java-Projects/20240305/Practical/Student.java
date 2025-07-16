public class Student{
	private String id;
	private String name;
	private String status;
	private String email;
	
	public Student(){
		this("44834624", "Mekayla Moyikwa", "Active", "44834624@mynwu.ac.za");
	}
	
	public Student(String id, String name,String status ,String email){
		setId(id);
		setName(name);
		setStatus(status);
		setEmail(email);
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setStatus(String status){
		this.status = status;
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
	
	public String getStatus(){
		return status;
	}
	
	public String getEmail(){
		return email;
	}
	
	public String toString(){
		return "The objects is : ID " + getId() + " , Name: " + getName() + " , Status: "+ getStatus() + " , Email: " + getEmail();
	}
}