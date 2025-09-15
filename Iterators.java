import java.util.ArrayList;

public class Iterators{
    public static void main(String args[])
    {
        ArrayList<String> list=new ArrayList<>();
        list.add("suma");
        list.add("Reddy");
        list.add("Satti");
        list.add("sweety");
        System.out.println(list);
        for(String i:list)
        {
            System.out.println(i);
        }
        list.remove(2);
        System.out.println(list);
    }
}
