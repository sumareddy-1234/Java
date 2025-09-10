import java.util.Scanner;
public class runTimeTwoDim
{
 public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  int row=sc.nextInt();
  int column=sc.nextInt();
  int a[][]=new int[row][column];
  for(int i=0;i<row;i++)
  {
    for(int j=0;j<column;j++)
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