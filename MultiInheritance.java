//Example for multi Inheritance
class Animal
{
  void eat()
  {
    System.out.println("Animals can Eat");
  }
}
class Mammals extends Animal
{
  void walk()
   {
     System.out.println("Mammals can Walk");
   }
}
class Dog extends Mammals
{
  void bark()
  {
    System.out.println("Dog Can Bark");
  }
}
//main program
class MultiInheritance
{
  public static void main(String args[])
  {
     Dog d=new Dog();
     d.bark(); 
     d.eat();
     d.walk();
  }
}
  