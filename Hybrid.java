interface A{
    public void showA();
}
interface B{
    public void showB();
}
class C implements A,B{
    public void showA(){
        System.out.println("Implement's A");
    }
    public void showB(){
        System.out.println("Implement's B");
    }
}
class D extends C{
    public void showC(){
        System.out.println("Implement's C");
    }
}
public class Hybrid {
    public static void main(String args[]){
        D obj=new D();
        obj.showA();
        obj.showB();
        obj.showC();
    }
}
