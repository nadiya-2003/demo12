abstract class Bank
{
abstract int getRateOfInterest();
}
class SBI extends Bank
{
int getRateOfInterest()//float  getRateOfInterest 
{
return 7;
}
}
class PNB extends Bank
{
int getRateOfInterest()
{
return 8;
}
}
class ICIC extends Bank
{
int getRateOfInterest()
{
return 6;
}
}
class UNION extends Bank
{
int getRateOfInterest()
{
return 9;
}
}
class KOTAK extends Bank
{
int getRateOfInterest()
{
return 10;
}
}
class HDFC extends Bank
{
int getRateOfInterest()
{
return 4;
}
}
class TestBank
{
public static void main(String args[])
{
Bank b;
b=new SBI();
System.out.println("Rate of Interest in SBI:"+b.getRateOfInterest()+"%");
b=new PNB();
System.out.println("Rate of Interest in PNB:"+b.getRateOfInterest()+"%");
b=new ICIC();
System.out.println("Rate of Interest in ICIC:"+b.getRateOfInterest()+"%");
b=new UNION();
System.out.println("Rate of Interest in UNION:"+b.getRateOfInterest()+"%");
b=new KOTAK();
System.out.println("Rate of Interest in KOTAK:"+b.getRateOfInterest()+"%");
b=new HDFC();
System.out.println("Rate of Interest in HDFC:"+b.getRateOfInterest()+"%");
}
}