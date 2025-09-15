abstract class Shape{
  abstract double area();
  abstract double perimeter();
  void display()
  {
    System.out.println("This is concrete method");
  }
}
class Circle extends Shape
{
  double radius;
  Circle(double radius)
  {
    this.radius=radius;
  }
  double area()
  {
    return Math.PI*radius*radius;
  }
  double perimeter() 
  {
    return 2*Math.PI*radius;
  }
  void display()
  {
    System.out.println("The area of Circle is:" +area());
    System.out.println("The perimeter of Circle is:"+perimeter());
  }
}
public class CircleArea
{
  public static void main(String args[])
  {
    Circle c=new Circle(7);
    c.display();
  }
}

     