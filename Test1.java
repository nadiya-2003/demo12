abstract class Myclass
{
public void disp1()
{
System.out.println("Cocerete method of parent class");
}
abstract public void disp2();
}
class Demo extends Myclass
{
public void disp2()
{
System.out.println("Overriding abstract method");
}
}
class Test1
{
public static void main(String args[])
{
Myclass obj;
obj=new Demo();
obj.disp1();
obj.disp2();
}
}