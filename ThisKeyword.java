import java.util.PrimitiveIterator;
    class Book {
    String title; //instance variables
    String Author; //instance variables
    int price; //instance variables
    Book()
    {
        System.out.println("Iam a Default constructor");
    }
    Book(String title) //name is local variable
    {
        this.title=title;
    }
    Book(String title,String Author)
    {
        this(title);
        this.Author=Author;
    }
    Book(String title,String Author,int price)
    {
        this(title,Author);
        this.price= price;
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
 