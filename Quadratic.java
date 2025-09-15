import java.util.*;
public class Quadratic{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double d=b*b-4.0*a*c;
        if(d>0.0)
        {
            double root1=(-b+Math.sqrt(d))/2.0*a;
            double root2=(-b-Math.sqrt(d))/2.0*a;
            System.out.println("the Nature of the Roots are Real");
            System.out.println(root1+","+root2);
        }
        else if(d==0.0)
        {
            double root1=-b/2.0*a;
            System.out.println("The Nature of the Root is only a single root");
            System.out.println(root1);
        }
        else
        {
            System.out.println("The roots are imaginary");
        }
    }
}
