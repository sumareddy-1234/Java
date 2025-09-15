class While
{
public static void main(String args[])
{
int num=2272006;
int sum=0;
while(num!=0)
{
sum+=num%10;
num/=10;
}
System.out.println("Sum of Individual digits in a given number:"+sum);
}
}
