public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        try{
        int div=10/0;
        System.out.println(div);
        }catch(ArithmeticException e)
        {
            System.out.println(e);
            //System.out.println("Don't devide a number with zero");
        }
        int arr[]={2,3,4,5};
        System.out.println(arr[2]);
    }
}
