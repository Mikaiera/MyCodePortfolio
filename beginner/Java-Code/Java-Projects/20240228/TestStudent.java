/**
	The main method has code to test all the methods in the class.
	@param args List of command line arguements - not used.
*/
public class TestStudent{
	public static void main(String[] args){
		Student s1 = new Student();
		System.out.println("Student s1 = "+ s1);
		s1.setStudentNumber("87654321");
		s1.setName("Andi Travis");
		System.out.println("Student s1 after calling set Method = " + s1.getStudentNumber() + " " + s1.getName());
		Student s2 = new Student("12345678" , "Les Nessman");
		System.out.println("Student s2 = " + s2);
	}
}