import java.util.Scanner;
class Employee{
String emp_name;
int emp_id;
String address;
String mail_id;
int mobile_no;
void display(){
System.out.println(emp_name);
System.out.println(address);
System.out.println(emp_id);
System.out.println(mail_id);
System.out.println(mobile_no);
}
}
class Programmer extends Employee{
int bp;
void display(){
System.out.println(bp);
System.out.println("DA"+0.97*bp);
System.out.println("HRA"+0.10*bp);
System.out.println("PF"+0.12*bp);
System.out.println("STAFF CLUD FUND"+0.001*bp);
}}
class Assistant_professor extends Employee{
int bp;
void display(){
System.out.println(bp);
System.out.println("DA"+0.97*bp);
System.out.println("HRA"+0.10*bp);
System.out.println("PF"+0.12*bp);
System.out.println("STAFF CLUD FUND"+0.001*bp);
}
}
class Associate_professor extends Employee{
int bp;
void display(){
System.out.println(bp);
System.out.println("DA"+0.97*bp);
System.out.println("HRA"+0.10*bp);
System.out.println("PF"+0.12*bp);
System.out.println("STAFF CLUD FUND"+0.001*bp);
}
}
class Professor extends Employee{
int bp;
void display(){
System.out.println(bp);
System.out.println("DA"+0.97*bp);
System.out.println("HRA"+0.10*bp);
System.out.println("PF"+0.12*bp);
System.out.println("STAFF CLUD FUND"+0.001*bp);
}
}
class Main{
public static void main(String args[]){
System.out.println("\n1.Programer\n2.Assistant_professor\n3.Associate_professor\n4.Professor");
Scanner input=new Scanner(System.in);
System.out.println("Enter an integer :");
int ch=input.nextInt();
switch(ch){
case 1:
Employee e1=new Employee();
Programmer p1=new Programmer();
e1.emp_name="abc";
e1.address="y-city";
e1.mail_id="praw@gmail.com";
e1.emp_id=567;
e1.mobile_no=2345678;
p1.bp=15000;
p1.display();
e1.display();
break;
case 2:
Employee e2=new Employee();
Assistant_professor p2=new Assistant_professor();
e2.emp_name="DEF";
e2.address="A-city";
e2.mail_id="rajan@gmail.com";
e2.emp_id=123;
e2.mobile_no=987321;
p2.bp=30000;
p2.display();
e2.display();
break;
case 3:
Employee e3=new Employee();
Associate_professor p3=new Associate_professor();
e3.emp_name="GHF";
e3.address="B-city";
e3.mail_id="main@gmail.com";
e3.emp_id=456;
e3.mobile_no=98710;
p3.bp=3000;
p3.display();
e3.display();
break;
case 4:
Employee e4=new Employee();
Professor p4=new Professor();
e4.emp_name="Kannan";
e4.address="Trichy";
e4.mail_id="kanna@gmail.com";
e4.emp_id=789;
e4.mobile_no=9810;
p4.bp=30000;
p4.display();
e4.display();
break;
case 5:
//exit(1)
default:
System.out.println("Enter Correct Choice");
}
}
}
