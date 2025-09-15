//Example for Single Inheritance
class parent
{
  int x=10;

 void displayx()
 {
   System.out.println("x value;"+x);
 }
}
class child extends parent
{
  int y=20;
  void displayy()
  {
   System.out.println("y value:"+y);
  }
}
//main program
class Inheritance
{ 
  public static void main(String args[]) 
{
  child c=new child();
  c.displayx();
}
}