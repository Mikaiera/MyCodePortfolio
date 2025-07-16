/**
Mekayla Moyikwa 
44834624
**/
public class TestException{

	public static void main(String[] args){

		try{
			Account a1 = new Account("46985575", 1000);
			System.out.println(a1);
		} catch (InvalidAccountNumber e){
			System.out.println("There was a problem...." + e);
		}
		
		
		try{
			Account a2 = new Account("53456785", 1000);
			System.out.println(a2);

		}catch (InvalidAccountNumber e){
			System.out.println("There was a problem...." + e);
		}
		
		System.out.println("Finish")
	}
}