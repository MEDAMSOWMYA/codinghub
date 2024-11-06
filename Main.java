//Method Overloading  and conversions
//method overloading---method name must be same---but parameters are defined in multiple ways---parameters order is also imp


class Main
{
 public void m1()
 {
   System.out.println("I am m1");
 }
 public void m1(float x)
 {
   System.out.println("I am also m1 "+x);
 }
 public void m1(short x)
 {
   System.out.println("I am m1 with short "+x);
 }

 public void m1(int x,char y)
 {
   System.out.println("I am m1 with int and char");
 }

 public static void main(String args[])
 {
   Main main;
   main=new Main();
   //main.m1(10,'3'); //overloading
   main.m1(20);       //overloading
   char c='z';    
   main.m1(c);   //implicit conversion
   main.m1((short)20.0);  //explicit conversion 
 }
}
