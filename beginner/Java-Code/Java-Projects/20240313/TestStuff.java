/**
@author GR Drevin
@version 20240313
*/
public class TestStuff
{
public static void main(String[] args)
	{
		Thing rt1 = new RoundThing("Blue",10);
		System.out.println(rt1 + "has area " + rt1.calcArea());
		Thing block = new SquareThing("Green",10);
		System.out.println(block + "has area " + block.calcArea());
	}
}









