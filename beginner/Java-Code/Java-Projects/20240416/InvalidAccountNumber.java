/**
Mekayla Moyikwa 
44834624
**/
public class InvalidAccountNumber extends RuntimeException{
	
	public InvalidAccountNumber(){
		this("Valid account number needs to have exactly 8 digits!");
	}
	
	public InvalidAccountNumber(String e){
		super(e);
	}
}