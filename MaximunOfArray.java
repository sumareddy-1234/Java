/*
Finding Maximum element in an array
*/
import java.util.Scanner;
public class MaximumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        // Finding max of an array
        int max = A[0];
        // Start a loop from 1st index
        for (int i = 1; i < n; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        System.out.println("Maximum element is: " + max);
    }
}
