public class ExtendingThreadClass extends Thread {
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Child thread");
        }
    }

    public static void main(String[] args){
        ExtendingThreadClass t=new ExtendingThreadClass();
        t.start();
        for(int i=1;i<=5;i++){
            System.out.println("Main thread");
        }
    }
}
