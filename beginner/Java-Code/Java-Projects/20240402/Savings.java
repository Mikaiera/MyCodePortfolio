public class Savings extends Account{
	
	private int minimumBalance;
	
	public Savings(){
		this("0000025522", 4537,75);
	}
	public Savings(String accountNumber, int balance, int minimumBalance){
		super(accountNumber,balance);
		setMinimumBalance(minimumBalance);
	}
	
	public void setMinimumBalance(int minimumBalance){
		this.minimumBalance = minimumBalance;
	}
	
	public int getMinimumBalance(){
		return minimumBalance;
	}
	
	public int calculateInterest( int r){
		if ( balance < minimumBalance)
			return 0;
		else 
			return (int)(balance*r)/100;
	}
	
	public String toString(){
		return "This object is AccountNumber: " + getAccountNumber() + ", AccountBalance: " + getBalance() + ", Minimum Balance: " + getMinimumBalance();
	}
}