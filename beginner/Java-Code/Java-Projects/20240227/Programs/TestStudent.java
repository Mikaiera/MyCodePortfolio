public class TestStudent{
	public static void main(String args[]){
		//Objects of student
		Student s1 = new Student();
		System.out.println("Student s1 =" + s1);
		s1.setStudentNumber("87654321");
		s1.setName("Andy Travis");
		System.out.println("Student s1 after calling = " + s1.getName() + ", Student number " + s1.getStudentNumber());
		
		Student s2 = new Student("12345678", "Les Nessman");
		System.out.println("Students s2 = "+ s2);
	}
}