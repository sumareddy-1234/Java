public class PrimesInArray
{
static boolean isPrime(int a)
{
if(a<=1)
return false;
for(int i=2;i<=Math.sqrt(a);i++)
{
if(a%i==0)
{
return false;
}
return true;
}
}
public static void main(String[] args)
{
int arr[]={2,3,4,5,6,7};
for(int i=0;i<arr.length;i++)
{
if(isPrime(arr[i]))//true
System.out.println(arr[i]+"is a prime");
}
}
}
