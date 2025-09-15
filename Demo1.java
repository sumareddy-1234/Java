@FunctionalInterface
interface A{
    int add(int a,int b);
}
class Demo1{
    public static void main(String args[])
    {
        A obj=(a,b)->(a+b);
        int result=obj.add(3,5);
        System.out.println(result);
    }
}
