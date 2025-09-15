import java.util.Scanner;
class ConditionalStatements
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your Age");
int age=sc.nextInt();
if(age<=12)
System.out.println("Child");
else if(age>=13 && age<=19)
System.out.println("Teenager");
else if(age>=20 && age<=59)
System.out.println("Adult");
else
System.out.println("Senior");
}
}