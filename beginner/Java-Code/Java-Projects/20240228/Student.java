/**
	This class manages info on Students.
	@author MX Moyikwa
	@version 20240228
*/

public class Student{
	private String name;
	private String studentNumber;
	
/**
	Constructor sets the instance variables to default values:
	StudentNumber = "00000000".
	name is an empty String.
*/

	public Student(){
		this("00000000", "");
	}
	
/** 
	Assigns parameters to the instance variables.
	@param studentNumber The university ID of a Student.
	@param name of the Student.
*/

	public Student(String name, String studentNumber){
		setName(name);
		setStudentNumber(studentNumber);
	}
	
/**
	Assigns parameter to studentNumber instance variable.
	@param studentNumber The university ID of Student.
*/

	public void setStudentNumber(String studentNumber){
		this.studentNumber  = studentNumber;
	}
	
/**
	Assigns parameter to name instance variable.
	@param name The name of Student.
*/

	public void setName(String name){
		this.name = name;
	}
	
/**
	Returns the value of the studentNumber instance variable.
	@return studentNumber The university ID of Student.
*/

	public String getStudentNumber(){
		return studentNumber;
	}
	
/**
	Returns the value of the instance variable name.
	@return value of name.
*/

	public String getName(){
		return name;
	}
	
/** 
	Returns a String representation of the object.
	@return String representation of the object.
*/

	public String toString(){
		return "The object is: Student number = " + studentNumber + " , Name = " + name;
	}
}