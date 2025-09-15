public class MaxMin
{
public static void main(String[] args)
{
int arr[]={22,42,48,29,54,57,23};
int max=arr[0];
int min=arr[0];
for(int i=1;i<arr.length;i++)
{
if(arr[i]<min)
{
min=arr[i];
}
if(arr[i]>max)
{
max=arr[i];
}
}
System.out.println("The Maximum Element is: "+max);
System.out.println("The Minimum Element is: "+min);
}
}