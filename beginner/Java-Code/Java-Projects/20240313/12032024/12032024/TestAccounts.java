/**
@author GR Drevin
@version 20240312
*/
public class TestAccounts
{
	public static void main(String[] args) 
	{
		System.out.println("TESTING ACCOUNT CLASS");
		Account a1 = new Account();
		System.out.println("Should display an account no of 0000000000 and balance of 0\n"+a1);
		a1.setAccountNumber("1987654321");
		System.out.println("Account number should be 1987654321, actual account number is: "+a1.getAccountNumber());
		a1.setBalance(250);
		System.out.println("Balance should be 250, actual balance: "+a1.getBalance());
		
		System.out.println("TESTING ACCOUNT CLASS using constructor with parameters:");
		Account a2 = new Account("2227654321",-200);
		System.out.println("Should display an account no of 2227654321 and balance of -200\n"+a2);
				
		System.out.println("\nTESTING CREDIT CLASS");
		Credit c1 = new Credit();
		System.out.println("Should display an account no of 0000000000, balance of 0 and overdraft limit of 0\n"+c1);
		c1.setAccountNumber("2187654321");
		System.out.println("Account number should be 2187654321, actual account number is: "+c1.getAccountNumber());
		c1.setBalance(-1250);
		System.out.println("Balance should be -1250, actual balance: "+c1.getBalance());	
		c1.setOverdraftLimit(-2000);
		System.out.println("Overdraft limit should be -2000, actual limit is: "+c1.getOverdraftLimit());	
		
		System.out.println("TESTING CREDIT CLASS using constructor with parameters:");
		Credit c2 = new Credit("2227654321",-200,-5000);
		System.out.println("Should display an account no of 2227654321, balance of -200 and overdraft limit of -5000\n"+c2);
		
		System.out.println("\nTESTING SAVINGS CLASS");
		Savings s1 = new Savings();
		System.out.println("Should display an account no of 0000000000, balance of 0 and minimum balance of 0\n"+s1);
		s1.setAccountNumber("2187654321");
		System.out.println("Account number should be 2187654321, actual account number is: "+s1.getAccountNumber());
		s1.setBalance(1250);
		System.out.println("Balance should be 1250, actual balance: "+s1.getBalance());	
		s1.setMinimumBalance(2000);
		System.out.println("Minimum balance should be 2000, actual minimum balance is: "+s1.getMinimumBalance());	
		
		System.out.println("TESTING SAVINGS CLASS using constructor with parameters:");
		Savings s2 = new Savings("2227654321",2500,5000);
		System.out.println("Should display an account no of 2227654321, balance of 2500 and minimum balance of 5000\n"+s2);
	}
}