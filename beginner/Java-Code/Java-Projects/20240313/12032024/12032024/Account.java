public class Account{
	private String accountNumber;
	private int balance;
	
	public Account(){
		this("0000000011",2563);
	}
	
	public Account(String accountNumber, int balance){
		setAccountNumber(accountNumber);
		setBalance(balance);
	}
	
	public void setAccountNumber(String accountNumber){
		this.accountNumber = accountNumber;
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
}