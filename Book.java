public class Book {
    String title;
    String Author;
    int price;
    Book()
    {
        System.out.println("Iam a Default constructor");
    }
    Book(String name)
    {
        title=name;
    }
    Book(String name,String Writer,int cost)
    {
        title=name;
        Author=Writer;
        price=cost;
    }
    public static void main(String[] args) {
        Book b1=new Book();
        Book b2=new Book("Effective java");
        Book b3=new Book("Clean code","Robert",3000);
        System.out.println(b1.title+","+b1.Author+","+b1.price);
        System.out.println(b2.title+","+b2.Author+","+b2.price);
        System.out.println(b3.title+" ,"+b3.Author+","+b3.price);
    }
}
 