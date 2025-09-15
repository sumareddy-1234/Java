import java.util.PrimitiveIterator;
    class Book {
    String name;//instance variable
    int age;
    Book()
    {
        System.out.println("This a default constructor");
    }
    Book(String name)
    {
        this();
        this.name=name;
    }
    public static void main(String[] args) {
        Book b2=new Book("siri");
        System.out.println(b2.name+","+b2.age);
    }
    }
 