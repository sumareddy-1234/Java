/*
Example program that shows default values of an un-initialized array
*/
public class ArrayExample2 {
    public static void main(String[] args) {
        // datatype[] array_name = new datatype[length]
        int[] arr = new int[5];
        System.out.println(arr[0]);
        boolean[] b = new boolean[3]; // 0 1 2
        System.out.println(b[1]);
    }
}
