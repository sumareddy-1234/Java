/* 
Program to read array of elements as input from user
*/

import java.util.Scanner;
public class ArrayExample3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // length of array -> no. of elements
        int[] arr = new int[n];
        // Loop
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // storing elements at indexes
        }
        // Access the values using a loop
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

