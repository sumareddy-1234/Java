class Shapes {
 // Method with one integer parameter
 void area(int s) {
 System.out.println("Area of square is: " + (s * s));
 }
 // Method with two integer parameters
 void area(int l, int b) {
 System.out.println("Area of rectangle is: " + (l * b));
 }
 // Method with one double parameter
 void area(double r) {
 System.out.println("Area of circle is: " + (Math.PI * r * r));
 }
 // Method with one float and one double parameter
 void area(float b, double h) {
 System.out.println("Area of triangle is: " + (0.5 * b * h));
 }
}
class Measure {
 public static void main(String[] args) {
 Shapes ob = new Shapes();
 ob.area(7); // Calls method with int parameter
 ob.area(4, 8); // Calls method with two int parameters
 ob.area(4.5); // Calls method with double parameter
 ob.area(4.8f, 5.7); // Calls method with float and double parameters
 }
} 
