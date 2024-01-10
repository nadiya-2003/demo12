abstract class Bike
{
abstract void run();
}
class Honda extends Bike
{
public void run()
{
System.out.println("Running  safely");
}
}
class Test3
{
public static void main(String args[])
{
Bike obj=new Honda();
obj.run();
}
}