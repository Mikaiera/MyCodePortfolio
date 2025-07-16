public class Account{
	private String accountNumber;
	public int balance;
	
	public Account(){
		this("0000000011",0);
	}
	
	public Account(String accountNumber, int balance){
		setAccountNumber(accountNumber);
		setBalance(balance);
	}
	
	public void setAccountNumber(String accountNumber){
		if(accountNumber.length() != 10)
			throw new InvalidAccountNumber("Account number " + accountNumber + " is invalid");
	}
	
	public void setBalance(int balance){
		this.balance = balance;
	}
	
	public String getAccountNumber(){
		return accountNumber;
	}
	public int getBalance(){
		return balance;
	}
	
	public String toString(){
		return "This object is AccountNumber: " + getAccountNumber() + ", AccountBalance: " + getBalance();
	}
	
	public static void main(String[] args){
		Account a1 = new Account();
		try{
			a1 = new Account("99092", 1000);
			System.out.println("There is a problem");
		} catch (InvalidAccountNumber e){
			System.out.println("There was a problem...." + e);
		}finally{
			System.out.println("Check complete.");
		}
		System.out.println(a1);
	}
}