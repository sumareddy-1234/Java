class parent
{
  int x=10;

 void display()
 {
   System.out.println("x value;"+x);
 }
}
class child extends parent
{
  int y=20;
  void display()
  {
   System.out.println("y value:"+y);
  }
}
//main program
class MethodOverriding
{ 
  public static void main(String args[]) 
{
  child c=new child();
  c.display();
  parent p=new parent();
  p.display();
}
}