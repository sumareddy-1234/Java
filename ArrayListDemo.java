import java.util.ArrayList;
public class ArrayListDemo {
   public static void main(String[] args){
    ArrayList<Integer> list=new ArrayList<>();
    list.add(3);
    list.add(7);
    list.add(6);
    list.add(9);
    System.out.println(list);
    for(Integer i:list){
        System.out.println(i);
    }
    list.remove(2);
    System.out.println(list);
   } 
}
