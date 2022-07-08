package if_condition;
import java.util.*;
import java.util.Scanner;
public class accept_marks_display_result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int m1,m2,m3,total;
 float per;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter marks of 3 subject");
 m1=sc.nextInt();
 m2=sc.nextInt();
 m3=sc.nextInt();
 total=m1+m2+m3;
 per=total/3;
 System.out.println("total" +  total+" \n percentage" + per);
 if( per>=70 && per<=100)
 {
	 System.out.println("Distinction");
 }
 else if(per>=60 && per <=60)
 {
	 System.out.println("First class");
 }
 else if(per>=55 && per<=60)
 {
	 System.out.println("Higher");
 }
 else if(per>=50 && per<55)
 {
	 System.out.println("Second ");
 }
 else if(per>=40 && per<=50)
 {
	 System.out.println("pass");
 }
 else
 {
	 System.out.println("fail");
 }
	}

}
