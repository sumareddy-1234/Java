class Increment
{
public static void main(String[] args){
  int a=5;
  int b=7;
  int c=a++ +b;
  int d=++a +b;
System.out.println("post Increment:"+c);
System.out.println("pre Increment:"+d);
}