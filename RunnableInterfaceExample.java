
class GoodMorning implements Runnable{
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
class Hello implements Runnable{
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
class Welcome implements Runnable{
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
public class  RunnableInterfaceExample extends Thread{
    public static void main(String args[]){
        Thread t1=new Thread(new GoodMorning());
        Thread t2=new Thread(new Hello());
        Thread t3=new Thread(new Welcome());

        t1.start();
        t2.start();
        t3.start();

    }
}