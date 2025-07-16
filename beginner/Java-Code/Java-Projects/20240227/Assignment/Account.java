//44834624 MX Moyikwa
public class Account{
	
	//Instances/Reference Variables
	private int balance;
	private String accNumber;
	
	// Constructors
	public Account(){//Default
		this("00000000", 100);
	}
	
	public Account(String aNo , int bal){
		setAccNumber(aNo);//fixed this here
		setBalance(bal);
	}
	
	//Set methods
	public void setAccNumber(String aNo){
		accNumber = aNo;
	}
	
	public void setBalance(int bal){
		balance = bal;
	}
	
	//Get methods
	public String getAccNumber(){
		return accNumber;
	}
	
	public int getBalance(){
		return balance; 
	}
	
	public String toString(){
		return "This object is " + accNumber + " ,Balance: " + balance;
	}
}
