final class parent
{
  final int x=10;
 final void display()
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
class FinalKeyword
{ 
  public static void main(String args[]) 
{
  child c=new child();
  c.displayy();
  parent p=new parent();
  p.display();
}
}