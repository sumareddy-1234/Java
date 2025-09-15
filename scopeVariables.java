class Main
{
static int x=10;
static void display()
  {
    int y=20;
    System.out.println("Iam a Local Variable: "+y);
  }
}
class ScopeVariables
{
public static void main(String args[])
  {
    System.out.println(Main.x);
    Main.display();
  }
}