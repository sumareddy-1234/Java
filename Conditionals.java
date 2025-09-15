import java.util.Scanner;
class Conditionals
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a operator");
char c=sc.next().charAt(0);
System.out.println("Enter any two numbers");
int num1=sc.nextInt();
int num2=sc.nextInt();
switch(c)
{
case'+':
System.out.println("Addition:"+(num1+num2));
break;

case'-':
System.out.println("Substraction:"+(num1-num2));
break;

case'*':
System.out.println("Multiplication:"+(num1*num2));
break;

case'/':
System.out.println("Division:"+(num1/num2));
break;

case'%':
System.out.println("Remainder:"+(num1%num2));
break;

default:
System.out.println("Invalid Choice");
}
}
}