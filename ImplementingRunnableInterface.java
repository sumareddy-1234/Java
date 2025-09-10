public class ImplementingRunnableInterface implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Child Thread");
        }
    }
    
    public static void main(String args[]){
        ImplementingRunnableInterface imp=new ImplementingRunnableInterface();
        Thread t=new Thread(imp);
        t.start();
        for(int i=1;i<=10;i++){
            System.out.println("Main thread");
        }
    }
}
