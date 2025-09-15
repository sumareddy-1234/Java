import java.util.Scanner;
import pack1.MathShorthandOperations;
class Testing
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        MathShorthandOperations ms=new MathShorthandOperations();
        int n=sc.nextInt();
        int x=ms.incrementBytwo(n);
        int y=ms.decrementBytwo(n);
        System.out.println(x);
        System.out.println(y);
    }
}
