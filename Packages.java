import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;
public class Packages {
    public static void main(String args[])
    {
        System.out.println(Math.sqrt(85));
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array Elements Before Sorting");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Array Elements after sorting");
        System.out.println(Arrays.toString(arr));
    }
}
