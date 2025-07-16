/**
@author GR Drevin
@version 20240313
*/
public class Thing
{
   private String color;
   
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
   
}