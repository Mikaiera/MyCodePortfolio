public class InvalidAccountNumber extends RuntimeException{
	
	public InvalidAccountNumber(){
		this("Valid account number needs to have exactly 10 digits!");
	}
	
	public InvalidAccountNumber(String e){
		super(e);
	}
}