import java.util.Scanner;
class Temperature
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Value");
int t=sc.nextInt();
if(t<0)
System.out.println("Freezing Weather");
else if(t>=0 && t<=10)
System.out.println("Very Cold Weather");
else if(t>=10 && t<=20)
System.out.println("Cold Weather");
else if(t>=20 && t<=30)
System.out.println("Normal Temperature");
else if(t>=30 && t<=40)
System.out.println("Hot Temperature");
else if(t>40)
System.out.println("Very Hot Temperature ");
else
System.out.println("Invalid");
}
}


