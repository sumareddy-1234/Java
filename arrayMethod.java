import java.util.Arrays;
public class arrayMethod
{
 public static void main(String[] args)
{
  int arr[]={2,3,4,5,6,7};
  int arr1[]=new int[6];
  int a[]={1,23,58};
  int array[][]={{1,2,3},{4,5,6}};
  System.out.println(Arrays.deepToString(array));
  Arrays.sort(arr,1,4);
  Arrays.sort(arr);
  System.out.println(Arrays.toString(arr));
  Arrays.fill(a,0);//void
  System.out.println(Arrays.toString(a));//string
  System.out.println(Arrays.binarySearch(arr,5));//number
  System.out.println(Arrays.equals(arr,a));
  arr1=Arrays.copyOf(arr,5);
  System.out.println(Arrays.toString(arr1));
}
} 