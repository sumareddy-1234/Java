import java.util.Formatter;
public class FormattedTable {
    public static void main(String args[])
    {
        for(int i=1;i<=20;i++)
        {
            Formatter formatter=new Formatter();
            formatter.format("2x%d=%d",i,(i*2));
            System.out.println(formatter);
        }
    }
}
