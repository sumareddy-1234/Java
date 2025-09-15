package Package1;
public class NestedTryDemo {
    public static void main(String args[]){
        try{
            try{
                try{
                    String str=null;
                    System.out.println(str.length());
                }
                catch(ArithmeticException e){
                    System.out.println(e.getMessage());
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
    
}
