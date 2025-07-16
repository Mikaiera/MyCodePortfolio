/**
Mekayla Moyikwa 
44834624
**/
public class TestException{

	public static void main(String[] args){
		Account a1 = new Account();
		try{
			a1 = new Account("46985575", 1000);
		} catch (InvalidAccountNumber e){
			System.out.println("There was a problem...." + e);
		}finally{
			System.out.println("Check complete.\n");
		}
		System.out.println(a1);
		
		Account a2 = new Account();
		try{
			a2 = new Account("53456785", 1000);
			System.out.println("This is a valid accountNumber");

		}catch (InvalidAccountNumber e){
			System.out.println("There was a problem...." + e);
		}finally{
			System.out.println("Check complete.\n");
		}
		System.out.println(a2);
	}
}