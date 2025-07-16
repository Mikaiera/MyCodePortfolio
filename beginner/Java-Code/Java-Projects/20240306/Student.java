public class Student extends Person{
	public Student(){
		this("44834624", "Mekayla Moyikwa","44834624@mynwu.ac.za");
	}
	
	public Student(String id, String name ,String email){
		super(id,name,email);
	}

	public String toString(){
		return "The objects is : ID " + getId() + " , Name: " + getName() + " , Email: " + getEmail();
	}
}