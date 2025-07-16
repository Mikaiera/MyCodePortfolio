/**
@author GR Drevin
@version 20240312
*/
public class Savings extends Account
{
	private int minimumBalance;

	public Savings()
	{
		this("0000000000",0,0);
	}
	
	public Savings(String accountNumber, int balance, int minimumBalance)
	{
		super(accountNumber, balance);
		setMinimumBalance(minimumBalance);		
	}
	public void setMinimumBalance(int minimumBalance)
	{
		this.minimumBalance = minimumBalance;
	}
	
	public int getMinimumBalance()
	{
		return minimumBalance;
	}
	public int calculateInterest(int r){
		if (getBalance() >= getMinimumBalance())
			return getBalance() * r/100; //The use of parenthesis is not always necessary so uhm you do not need to do it
		else
			return 0;
	}
	public String toString()
	{
		return super.toString()+" and minimum balance "+getMinimumBalance();
	}
}









