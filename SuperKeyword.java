class Shape{
    String color;
    Shape(String color){
        this.color=color;
        System.out.println("The colour of the shape is:"+color);
    }
    void display(){
        System.out.println("A method from shape class");
    }
}
class Rectangle extends Shape{
    double length,width;
    Rectangle(String color,double length,double width){
        super(color);         //calling super class constructor
        this.length=length;
        this.width=width;
    }
    void displayInfo(){
        super.display();          //calling super class method
        System.out.println("The value of variable colour is:"+super.color);           //calling super class variable
        System.out.println("The length of Rectangle is:  "+length+" The width of Rectangle is: "+width);
    }
}
class SuperKeyword{
    public static void main(String[] args) {
        //Shape s=new Shape("Green");
        Rectangle r=new Rectangle("RED",34.5,67.8);
        r.displayInfo();

    }
}
