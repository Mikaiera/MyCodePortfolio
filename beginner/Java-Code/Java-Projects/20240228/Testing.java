public class Testing{
	
	public static void main(String[] args){
		Student s1 = new Student();
		System.out.println("Student 1 : " + s1);
		//s1.setId("46362783");
		//s1.setName("Kathy Johns");
		//s1.setStatus("Active");
		//s1.setEmail("46362783@mynwu.ac.za");
		System.out.println("Student s1 after calling set Method" + s1.getId() + " " + s1.getName() + " " + s1.getStatus() + " " + s1.getEmail());
		
		Faculty f1 = new Faculty();
		System.out.println("Faculty 1 : " + f1);
		f1.setId("");
		f1.setName("");
		f1.setRank("");
		f1.setOffice("");
		f1.setEmail("");
		
		
		Staff st1 = new Staff();
		System.out.println("Staff 1 : " + st1);
		st1.setId("");
		st1.setName("");
		st1.setTitle("");
		st1.setOffice("");
		st1.setEmail("");
	}
}