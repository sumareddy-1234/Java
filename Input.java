import java.util.Scanner;
class InputReader
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any 4 numbers and 3 strings");
byte b=sc.nextByte();
short sh=sc.nextShort();
int i=sc.nextInt();
long l=sc.nextLong();
char c=sc.next().charAt(0);
String s=sc.next();
sc.nextLine();
String ss=sc.nextLine();
System.out.println("Entered byte value:"+b);
System.out.println("Entered short value:"+sh);
System.out.println("Entered int value:"+i);
System.out.println("Entered long value:"+l);
System.out.println("Entered char value:"+c);
System.out.println("Entered string value:"+s);
System.out.println("Entered string Entire line:"+ss);
}
}

