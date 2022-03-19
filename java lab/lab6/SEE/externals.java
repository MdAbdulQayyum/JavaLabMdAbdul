package SEE;
import CIE.*;
import java.util.Scanner;
public class externals extends CIE.student{
Scanner sc=new Scanner(System.in);
public int seem[]=new int[5];
public void accept(){
for(int i=0;i<5;i++){
System.out.println("Enter the subject marks:"+(i+1));
seem[i]=sc.nextInt();
}
}
}