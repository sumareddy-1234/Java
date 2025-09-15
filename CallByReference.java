import java.net.CacheRequest;

public class CallByReference {
    int x=100;
    void method(CallByReference c)
    {
        c.x=c.x+100;
    }

    public static void main(String[] args) {
        CallByReference c=new CallByReference();
        System.out.println("Before passing the value of x is:"+c.x);
        c.method(c);//x=200;
        System.out.println("After passing the value of x is:"+c.x);
    }
}
 