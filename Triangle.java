import java.util.Scanner;
class Triangle
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any Three Numbers");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if(a==b && b==c && c==a)
System.out.println("Equilateral Triangle");
else if(a==b || b==c || c==a)
System.out.println("Isosceles Traingle");
else
System.out.println("Scalence Triangle");
}
}

