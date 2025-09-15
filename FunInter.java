@FunctionalInterface
interface A{
    void show1();
}
public class FunInter{
    public static void main(String args[]){
        A obj=()->System.out.println("Show Method");
        obj.show1();
    }
}
