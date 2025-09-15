class FormattedNumber
{
public static void main(String args[])
{
float f=54.57489467f;
String s=String.format("%.4f",f);
System.out.println(s);
System.out.printf("%.2f\n",f);
System.out.printf("%.2f%n",f);
System.out.printf("%.4f",f);
}
}
