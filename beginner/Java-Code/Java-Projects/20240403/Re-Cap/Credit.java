/**
@author GR Drevin
@version 20240312
*/
public class Credit extends Account
{
	private int overdraftLimit;
	
	public Credit()
	{
		this("0000000000",0,0);
	}
	
	public Credit(String accountNumber, int balance, int overdraftLimit)
	{
		super(accountNumber, balance);
		setOverdraftLimit(overdraftLimit);
	}
	
	public void setOverdraftLimit(int overdraftLimit)
	{
		this.overdraftLimit = overdraftLimit;
	}
	
	public int getOverdraftLimit()
	{
		return overdraftLimit;
	}

	public int calculateInterest(int r){
		int interest = 0;
		if (getBalance() < getOverdraftLimit())
			interest = getBalance() * 4 * r / 100;
		else if (getBalance() < 0 )
			interest = getBalance() * 2 * r/100;
		else
			interest = getBalance() * r / 100;

		return interest;
	}
	public String toString()
	{
		return super.toString() + " and overdraft limit "+getOverdraftLimit();
	}
}