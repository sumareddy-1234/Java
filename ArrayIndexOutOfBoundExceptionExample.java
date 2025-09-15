public class ArrayIndexOutOfBoundExceptionExample {
    public static void main(String[] args) {
        try{
        int arr[]={2,3,4,5};
        System.out.println(arr[4]);
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Finally Block");
        }
    }
}
