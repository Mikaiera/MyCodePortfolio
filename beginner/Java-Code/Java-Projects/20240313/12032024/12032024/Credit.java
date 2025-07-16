public class Credit extends Account{
	private int overDraft;
	
	public Credit(){
		this("0000012121", 0, -465);
	}
	
	public Credit(String accountNumber, int balance, int overDraft){
		super(accountNumber,balance);
		setOverdraftLimit(overDraft);
	}
	
	public void setOverdraftLimit(int overDraft){
		this.overDraft = overDraft;
	}
	
	public int getOverdraftLimit(){
		return overDraft;
	}
	
	public String toString(){
		return "This object is AccountNumber: " + getAccountNumber() + ", AccountBalance: " + getBalance() + ", Over Draft: " + getOverdraftLimit();
	}
}