class Sample
{
static int x=10;//static variable
int z;          //instance Variable
static void display()
  {
    int y=20;   //Local Variable
    System.out.println("Iam a Local Variable: "+y);
  }
}
class ScopeVariables
{
public static void main(String args[])
  {
    Sample s1=new Sample();
    System.out.println(Sample.x);
    Sample.display();
    s1.z=30;
    System.out.println(s1.z);
  }
}