public class Addition {
    int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        Addition obj1=new Addition();
        int result=obj1.add(6,7);
        System.out.println(result);
    }
}
