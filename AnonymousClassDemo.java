interface A
{
    void show(); //abstract method
}
public class AnonymousClassDemo
{
    public static void main(String args[])
    {
        A obj=new A()
        {
            public void show()
            {
                System.out.println("Show Method");
            }
        };
        obj.show();
    }
}
