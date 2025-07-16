/**
@author GR Drevin
@version 20240313
*/
public class RoundThing extends Thing
{
   private int radius;
   
   public RoundThing()
   {
      this("",1);
   }
   
   public RoundThing(String color, int radius)
   {
      super(color);
      setRadius(radius);
   }
   
   public int getRadius()
   {
      return radius;
   }
   
   public void setRadius(int r)
   {
         radius=r;
   }

   public int calcArea(){
      return (int)(Math.PI*radius*radius);
   }

   public String toString()
   {
      return "I am a "+getColor()+" round thing with radius "+getRadius()+"."; 
   }
  
   public static void main(String[] args) 
   {
      RoundThing rt1 = new RoundThing("Blue",10);
      System.out.println(rt1);
   }
}