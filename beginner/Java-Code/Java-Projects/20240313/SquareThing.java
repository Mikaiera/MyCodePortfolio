/**
@author GR Drevin
@version 20240313
*/
public class SquareThing extends Thing
{
   private int length;
   
   public SquareThing()
   {
      this("",1);
   }
   
   public SquareThing(String color, int length)
   {
      super(color);
      setLength(length);
   }
   
   public void setLength(int length)
   {
      this.length=length;         
   }
         
   public int getLength()
   {
      return length;
   }
   public int calcArea(){
      return length*length;
   }
   public String toString()
   {
      return "I am a "+getColor()+" square thing with sides "+getLength()+" units long.";
   }
      
   public static void main(String[] args) 
   {
      SquareThing block = new SquareThing("Green",10);
      System.out.println(block);
   }
}