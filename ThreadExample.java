class GoodMorning extends Thread{
    public void run(){
        while(true){
            try{
                Thread.sleep(1000);
                System.out.println("Good Morning");
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
class Hello extends Thread{
    public void run(){
        while(true){
            try{
                Thread.sleep(2000);
                System.out.println("Hello");
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
class Welcome extends Thread{
    public void run(){
        while (true){
            try{
                Thread.sleep(3000);
                System.out.println("Welcome");
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class ThreadExample extends Thread{
    public static void main(String args[]){
        GoodMorning t1=new GoodMorning();
        Hello t2=new Hello();
        Welcome t3=new Welcome();
        t1.start();
        t2.start();
        t3.start();
    }
} 