import java.util.Scanner;

public class Prog20240221C{
	public static void main(String[] args){
		char c1 = 'A';
		char c2 = 'z';
		
		if(c1 > c2){
			System.out.println(c1 + " is greater than " + c2 );
		}else{
			System.out.println(c2 + " is greater than " + c1);
		}
		int i3 = c1+10;
		char c3 = (char)(c1+10);
		System.out.println(c1 + " +10 " + c3);
		
	}
}