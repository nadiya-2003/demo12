abstract class Shape
{
abstract void draw();
}
class Rectangle extends Shape
{
public void draw()
{
System.out.println("Drawing Rectangle");
}
}
class Circle extends Shape
{
public void draw()
{
System.out.println("Drawing Circle");
}
}
class Test4
{
public static void main(String args[])
{
Shape s=new Circle();
s.draw();
Shape r=new Rectangle();
r.draw();
}
}