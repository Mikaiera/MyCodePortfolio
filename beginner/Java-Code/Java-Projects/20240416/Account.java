/**
Mekayla Moyikwa 
44834624
**/
public class Account{
	private String accountNumber;
	public int balance;
	
	public Account(){
		this("00000000",1000);
	}
	
	public Account(String accountNumber, int balance){
		setAccountNumber(accountNumber);
		setBalance(balance);
	}
	
	public void setAccountNumber(String accountNumber){
		if(accountNumber.length() != 8){
			throw new InvalidAccountNumber("Account number " + accountNumber + " is invalid");
		}
		else if(accountNumber.length() == 8){
			int sum = 0;
			char stuNumber;
			int numValue;
			int weight = 8;
	
			for(int i = 0; i<8; i++){
				stuNumber = accountNumber.charAt(i);
				numValue = stuNumber-'0';
				
				sum +=(numValue*weight);
				weight--;
				//System.out.println(sum);
			}
			if(sum % 11 == 0){
				this.accountNumber = accountNumber;
			}
			else{
				throw new InvalidAccountNumber("Account number " + accountNumber + " is invalid");
			}
		}
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