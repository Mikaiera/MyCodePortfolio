/**
@author GR Drevin
@version 20240313
*/
public abstract class Thing implements Calculable
{
   private String color;

   public abstract int calcArea();//This is abstract
   public Thing()
   {
      this("");
   }
   
   public Thing(String color)
   {
      setColor(color);
   }
   
   public void setColor(String color)
   {
      this.color = color;
   }
   
   public String getColor()
   {
      return color;
   }
   
   
   public String toString()
   {
      return "I am a "+getColor()+" thing";
   }

   public static void main(String args[]){
      Thing t1;//Reference variable that points to a thing object
   }
}