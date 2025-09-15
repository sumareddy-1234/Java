class Shape
{
  void draw()
  {
    System.out.println("Draw the Shape");
  }
}
class Circle extends Shape
{
  void draw()
  {
    System.out.println("Draw the Circle");
  }
}
class Square extends Shape
{
  void draw()
  {
    System.out.println("Draw the Square");
  }
}
public class DynamicMethodDispatch
{ 
  public static void main(String[] args)
  {
    Shape s;
    s=new Circle();
    System.out.println(s instanceof Circle);
    s.draw();
    s=new Square();
    System.out.println(s instanceof Circle);
    s.draw();
    System.out.println(s instanceof Square);
  }
}
     
  
