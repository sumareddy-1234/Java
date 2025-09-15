//calculate simple interest
//p=principle
//r=rate of the amount
//t=time taken
import java.util.Scanner;
class SimpleInterest
{
public static void main(String Args[])
{
int p=Integer.parseInt(Args[0]);
int r=Integer.parseInt(Args[1]);
int t=Integer.parseInt(Args[2]);
float s=(p*r*t)/100;
System.out.printf("%.2f",s);
}
}