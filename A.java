//an example where we are accessing all the elements present at odd index
class A
{
public static void main(String args[])
{
String str="WELCOME TO COLLEGE";//();using scanner
for(int i=0;i<=str.length()-1;i++)
{
 if(i%2!=0)
{
System.out.println("Char at"+"+place"+str.charAt(i));
}
}
}
}