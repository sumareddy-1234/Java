//Example for Single Inheritance
class SimpleCalculator
{
  int add(int a,int b)
  {
    return a+b;
  }
   int sub(int a,int b)
  {
    return a-b;
  }
   int mul(int a,int b)
  {
    return a*b;
  }
   double div(int a,int b)
  {
    return a/b;
  }
}
class AdvancedCalculator extends SimpleCalculator
{
  double sqrt(int a)
  {
    return Math.sqrt(a);
  }
  double pow(int a)
  {
    return Math.pow(a,2);
  }
  double exp(int a)
  {
    return Math.exp(a);
  }
}
//main program
class Calculator
{
  public static void main(String args[])
  {
    AdvancedCalculator a=new AdvancedCalculator();
    System.out.println("Add:"+a.add(2,2));
    System.out.println("sub:"+a.sub(2,2));
    System.out.println("Mul:"+a.mul(2,2));
    System.out.println("div:"+a.div(2,2));
    System.out.println("sqrt:"+a.sqrt(4));
    System.out.println("pow:"+a.pow(2));
    System.out.println("exp:"+a.exp(4));
   }
}
    


