import java.util.Scanner;
public class InstanceMethod {
    boolean isPrime(int Number)
    {
        if(Number<=1)
        return false;
        for(int i=2;i<=Math.sqrt(Number);i++)
        {
            if(Number%i==0)
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int Number=sc.nextInt();
        InstanceMethod obj1=new InstanceMethod();
        if(obj1.isPrime(Number))
        System.out.println(Number+"is a prime");
        else
        System.out.println(Number+"is not a prime");
    }
}
