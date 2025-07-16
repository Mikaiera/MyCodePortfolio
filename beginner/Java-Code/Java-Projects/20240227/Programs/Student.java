public class Student{
	//Reference variables/ instances
	private String name;
	private String studentNumber;
	
	//Constructors
	public Student(){//This is a default constructor
		this("00000000", "");//the "This"object is a referal to itself in the ob
	}
	
	public Student(String sNo, String nm){
		setStudentNumber(sNo);//Fixed here
		setName(nm);
	}
	
	public void setStudentNumber(String sNo){
		studentNumber = sNo;
	}
	
	//Methods
	public void setName(String nm){
		name = nm;
	}
	
	public String getStudentNumber(){
		return studentNumber;
	}
	
	public String getName(){
		return name;
	} 
	
	public String toString(){
		return "The object is : "+ studentNumber+ " ,Name = " + name;
	}
}