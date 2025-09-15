/*
Sum of even numbers in an array
*/

import java.util.Scanner;
public class EvenElementSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read array length from user
        int n = sc.nextInt();
        // Declare an array
        int[] A = new int[n];
        // Reading array elements
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        // Process of adding
        int sum = 0;
        for (int i = 0; i < n; i++) { // sum = 0;
            if (A[i] % 2 == 0) {
                sum += A[i]; // sum = sum + A[i];
            }
        }
        System.out.println(sum);
    }
}

