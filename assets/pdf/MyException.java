import java.lang.Exception;
class Myownexception extends Exception
{
Myownexception(String msg)
{
super(msg);
}
}
class MyException
{
public static void main(String args[])
{
int age;
age=15;
try
{
if(age<21)
throw new Myownexception("Your age is very less than the condition");
}
catch(Myownexception e)
{
System.out.println("This is My Exception block");
System.out.println(e.getMessage());
}
finally
{
System.out.println("Finally block : End of the program");
}
}
}