//constructor overloading


class Sample
{
int a;
char b;
Sample()
{
System.out.println("Iam no parameterized constructor");
}
Sample(int a)
{
this.a=a;
System.out.println("Iam one parameterized constructor "+a);

}
Sample(int a,char b)
{
this.a=a;
this.b=b;
System.out.println("Iam two parameterized constructor "+a+" "+b);

}
public static void main(String args[])
{
Sample s;
s=new Sample(10);
}
}
