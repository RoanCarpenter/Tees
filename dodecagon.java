
/**
 * Write a description of class dodecagon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class dodecagon implements Shape
{
    private int radius = 12;
    private String color;
    private String blue;
    private int side = 5;
   public dodecagon(int radius, String color, int side)
  {
    this.radius = radius;
    this.color = blue;
    this.side = side;
  } 
  
  public double getArea()
  {
    return this.side * this.radius * 12 *.5 ;
  }
  
  public double getPerimeter()
  {
    return this.side * 12;
  }
  
  public String getColor()
  {
    return this.color;
  }
}
