//Example for Hierarchical Inheritance
class Animals
{
  void MakeSound() 
  {
    System.out.println("Animals Can make Sound");
  }
  void eat()
  {
   System.out.println("Animals can Eat");
  }
}
class Dog extends Animals
{
 void Bark()
  {
    System.out.println("Dog can Bark");
  }
}
class Cat extends Animals
{
  void meow()
  {
    System.out.println("Cat meows");
  }
}
//main program
class HierarchicalInheritance
{
  public static void main(String args[])
  {
    Animals a=new Animals();
    a.MakeSound();
    a.eat();
    Dog d=new Dog();
    d.MakeSound();
    d.eat();
    d.Bark();
    Cat c=new Cat();
    c.MakeSound();
    c.eat();
    c.meow();
  }
}
