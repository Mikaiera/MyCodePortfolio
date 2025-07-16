import java.util.Scanner;

public class Prog20240214A
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in); //Here scanner is the type/class its literally almost like writing str input
		System.out.print("Please enter your name: ");
		String name = input.nextLine();
		System.out.println("Welcome to CMPG211 " + name);
		System.out.printf("I hope you will enjoy it, %s\n ", name);
	}
	
}

