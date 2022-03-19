package CIE;
import java.util.Scanner;
public class student{
Scanner sc=new Scanner(System.in);
public String name,usn;
public int sem;
public void accept(){
System.out.println("Enter the Name:");
name=sc.nextLine();
System.out.println("Enter the USN :");
usn=sc.nextLine();
System.out.println("Enter the sem:");
sem=sc.nextInt();
}
public void display(){
System.out.println("Name:"+name);
System.out.println("USN:"+usn);
System.out.println("SEM:"+sem);
}
}

