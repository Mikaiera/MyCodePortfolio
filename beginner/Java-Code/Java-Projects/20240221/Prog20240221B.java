import java.util.Scanner;

public class Prog20240221B{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int val = input.nextInt();//Integar.parseInt(input.next())
		System.out.println("The value is "+val);
		System.out.println("Two times the value is " + val*2);
		System.out.println("The square of the value is "+ Math.pow(val,2));
		System.out.println("The square root value is "+ Math.pow(val,0.5));
		System.out.println("The other way of square rooting the value is "+ Math.sqrt(val));
	}
}