import java.util.Formatter;
public class FormatterClass {
    public static void main(String[] args){
        String name="Suma";
        int age=18;
        Formatter formatter=new Formatter();
        formatter.format("Name:%s,Age=%d",name,age);
        System.out.println(formatter);
    }
}
