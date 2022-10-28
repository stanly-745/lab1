class RunErrDemo
{
public static void main(String[]args)
{
int a,b,c;
a=10;
b=0;
try
{
c=a/b;
}
catch(ArithmeticException e)
{
System.out.println("\n Divided by zero");
}
System.out.println("\n The value of a:"+a);
System.out.println("\n The value of b:"+b);
}
}