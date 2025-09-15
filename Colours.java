import java.util.Scanner;
class Colours
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Character");
char c=sc.next().charAt(0);
switch(c)
{
case 'V':
System.out.println("Violet");
break;

case 'I':
System.out.println("Indigo");
break;

case 'B':
System.out.println("Blue");
break;

case 'G':
System.out.println("Green");
break;

case 'Y':
System.out.println("Yellow");
break;

case 'O':
System.out.println("Orange");
break;

case 'R':
System.out.println("Red");
break;

default:
System.out.println("Invalid Choice");
}
}
}