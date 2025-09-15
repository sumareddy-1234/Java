/* 
Example Program for different array initializations and element access using indices
*/
public class ArrayExample1 {
    public static void main(String[] args) {
        // Array Initialization
        int[] A = {10, 20, 30, 40, 50}; // Array of 5 integers
        // index   0  1   2  3   4
        String[] S = {"we", "love", "java", "very much"}; // Array of 4 strings
        // index     0     1       2        3
        double[] D = {3.3, 4.5, 6.6}; // Array of 3 double values
        // index     0    1   2

        // Q1. What should be written to print very much
        System.out.println(S[3]);
        // Q2. What should be written to print 30
        System.out.println(A[2]);
        // Q3. What should be written to print 3.3
        System.out.println(D[0]);
    }
}

