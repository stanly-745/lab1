import java.io.*;
import java.util.Scanner;
class FileDemo
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String filename;
System.out.println("Enter the file name");
filename=s.next();
File f1=new File(filename);
System.out.println("file name     :"+f1.getName());
System.out.println("path          :"+f1.getPath());
System.out.println("parent        :"+f1.getParent());
System.out.println("File Exists   :"+f1.exists());
System.out.println("Readable      :"+f1.canRead());
System.out.println("Writable      :"+f1.canWrite());
System.out.println("Directory     :"+f1.isDirectory());
System.out.println("File or not   :"+f1.isFile());
System.out.println("Last Modified :"+f1.lastModified());
System.out.println("Length        :"+f1.length());
System.out.println("Hidden        :"+f1.isHidden());
}
}