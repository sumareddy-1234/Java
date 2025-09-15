//calculate simple interest
//p=principle
//r=rate of the amount
//t=time taken
import java.util.Scanner;
class SimpleInterest
{
public static void main(String Args[])
{
Scanner sc=new Scanner(System.in);
float p=sc.nextFloat();
float r=sc.nextFloat();
float t=sc.nextFloat();
float s=(p*r*t)/100;
System.out.printf("%.2f",s);
}
}