public class TwoDimSum
{
 public static void main(String[] args)
{
  int a[][]={{1,2,3},{4,5,6},{7,8,9}};
  for(int ele[]:a)
  {
    int sum=0;
    for(int arr:ele)
    { 
      sum+=arr;
    }
     System.out.print(sum);
  }
}
} 