import java.util.Scanner;
class Table
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=1;i<=20;i++)
{
//System.out.printf(num+"x"+i+"="+(num*i));
System.out.printf("%d x %d = %d\n",num,i,(num*i));
}
}
}