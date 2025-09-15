import java.util.Scanner;
class Vote
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int Age=sc.nextInt();
System.out.println((Age)<=18?"Not Eligible for Vote":"Eligible for Vote");
}
}