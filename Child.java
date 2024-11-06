//Method over-riding
//Method over-riding-----methods must be same in both parent and child class

class Child extends Parent
{
 public void m1()
{
System.out.println("Im in child");
}
public static void main(String args[])
{
  Child main;
  main=new Child();
  main.m1();
  main.m2();  
}
}
class Parent
{
public void m1()
{
System.out.println("Im in parent");
}
public void m2()
{
System.out.println("I am m2");
}
}