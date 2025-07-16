//44834624 MX Moyikwa
public class TestAccount{
	public static void main(String[] args){
		Account a1 = new Account();
		System.out.println("Account a1 = " + a1);
		
		a1.setBalance(2000);
		a1.setAccNumber("12345678");
		System.out.println("The account a1 after being set: " + a1.getAccNumber() + " , the balance of this account is: " + a1.getBalance());
		
		Account a2 = new Account("12345678", 10000);
		System.out.println("Account a2 = "+ a2);
	}
}