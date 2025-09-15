import java.util.Scanner;
public class ArrayDeclaration
{
public static void main(String args[])
{
//compile time initialization
String Weeks[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
System.out.println(Weeks[1]);
for(String s:Weeks)
{
 System.out.println(s);
}
}
}