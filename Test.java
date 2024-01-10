abstract class Animal
{
public abstract void sound();
}
class Dog extends Animal
{
public void sound()
{
System.out.println("Woof");
}
}
class Lion extends Animal
{
public void sound()
{
System.out.println("Roars");
}
}
class Cat extends Animal
{
public void sound()
{
System.out.println("Meows");
}
}
class Test
{
public static void main(String args[])
{
Animal a;
a=new Dog();
a.sound();
a=new Lion();
a.sound();
a=new Cat();
a.sound();
}
}