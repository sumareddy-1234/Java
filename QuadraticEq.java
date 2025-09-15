class QuadraticEq{
 public static void main(String args[]){ 
double a=1,b=4,c=6,d; 
double r1,r2; 
d=(b*b)-(4*a*c); 
if(d>0){ 
r1=(-b+Math.sqrt(d))/(2*a);
 r2=(-b-Math.sqrt(d))/(2*a); System.out.println("root1="+r1+"root2="+r2);
System.out.println("roots are distinct"); 
} else if(d==0){ 
r1=r2=(-b)/(2*a); 
System.out.println("root1="+r1+"root2="+r2); 
System.out.println("roots are equal");
 } else{
 System.out.print("roots are imaginary"); 
}
}
}

