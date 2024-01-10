interface Drawable
{
void draw();
}
class Rectangle implements Drawable
{
public void draw()
{
System.out.println("drawing rectangle");
}
}
class Circle implements Drawable
{
public void draw()
{
System.out.println("drawing circle");
}
}
class Test9
{
public static void main(String args[])
{
Drawable a=new Circle();
a.draw();
Drawable d=new Rectangle();
d.draw();
}
}