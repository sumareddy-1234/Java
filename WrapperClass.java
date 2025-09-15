public class WrapperClass {
    public static void main(String args[]){
        //Autoboxing
        int num1=8;//primitive
        Integer wrappedNum1=num1;//object
        System.out.println(wrappedNum1);
        //unboxing
        Integer num2=Integer.valueOf(4);
        int wrappedNum2=num2;
        System.out.println(wrappedNum2);
    }
}
