public class Testing{
	
	public static void main(String[] args){
		Student s1 = new Student();
		System.out.println("Student 1 (Default) : " + s1);
		s1.setId("46362783");
		s1.setName("Kathy Johns");
		s1.setStatus("Active");
		s1.setEmail("46362783@mynwu.ac.za");
		System.out.println("Student s1 after calling set Method , ID: " + s1.getId() + " ,Name: " + s1.getName() + " ,Status: " + s1.getStatus() + " ,Email: " + s1.getEmail() + "\n");
		
		Faculty f1 = new Faculty();
		System.out.println("Faculty 1 (Default) : " + f1);
		f1.setId("00001111");
		f1.setName("ECOM");
		f1.setRank("2");
		f1.setOffice("E8-G01");
		f1.setEmail("00001111@mynwu.ac.za");
		System.out.println("Faculty f1 after calling set Method,, ID: " + f1.getId() + " ,Name: " + f1.getName() + " ,Rank: " + f1.getRank() + " , Office: " + f1.getOffice() + " ,Email: " + f1.getEmail() + "\n");
		
		Staff st1 = new Staff();
		System.out.println("Staff 1 (Default) : " + st1);
		st1.setId("22375677");
		st1.setName("Jack Bells");
		st1.setTitle("DR.");
		st1.setOffice("J2-001");
		st1.setEmail("22375677@mynwu.ac.za");
		System.out.println("Staff st1 after calling set Method , ID: " + st1.getId() + " ,Name: " + st1.getName() + " ,Title: " + st1.getTitle() + " ,Office: "+ st1.getOffice() + " ,Email: " + st1.getEmail() + "\n");
	}
}