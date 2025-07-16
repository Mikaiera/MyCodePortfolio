import java.util.Scanner;

public class Prog20240221{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Please give your name: ");
		String name = input.nextLine();
		System.out.println("Welcome to CMPG211 " + name);
		System.out.printf("I hope you are enjoying this %s \n", name);
	}
}