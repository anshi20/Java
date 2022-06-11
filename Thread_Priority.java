class A extends Thread
{
  public void run()
  {
    int i;
    for(i=1;i<=30;i++)
    {
       System.out.println("From Thread :  "+i);
     }
   }
}
class B extends Thread
{
  public void run()
  {
    int i;
    for(i=1;i<=10;i++)
    {
       System.out.println("From Thread :  "+i);
     }
   }
}

class C extends Thread
{
  public void run()
  {
    int i;
    for(i=1;i<=20;i++)
    {
       System.out.println("From Thread :  "+i);
     }
   }
}
class Xy
{
  public static void main(String args[])
  {
     A a=new A();
     a.start();
     a.setPriority(10);
     System.out.println(a.getPriority());
     B b=new B();
     b.start();
     b.setPriority(5);
     System.out.println(b.getPriority());
     C c=new C();
     c.start();
     c.setPriority(1);
     System.out.println(c.getPriority());
   }
}
