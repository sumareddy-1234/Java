import java.util.Scanner;
public class ArrayMatrix
{
 public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  int a[][]=new int[3][3];
  for(int i=0;i<3;i++)
  {
    for(int j=0;j<3;j++)
    {
      a[i][j]=sc.nextInt();
     }
  }
  for(int arr[]:a)
  {
    for(int ele:arr)
    { 
      System.out.print(ele+" ");
    }
     System.out.println();
  }
}
} 