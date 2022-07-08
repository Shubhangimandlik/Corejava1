package if_condition;
import java.util.*;
import java.util.Scanner;

public class chk_2no_bet {
	  public static void main(String args[])
	  {
		 int a,b,c;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter 3 numbers");
		 a=sc.nextInt();
		 b=sc.nextInt();
		 c=sc.nextInt();
		 
		 if(b>a && b<c)
		 { 
			 System.out.println(b +" is between "+ a +" and "+c);
		 }
		 else
		 {
			 System.out.println(b +" is not between "+ a +" and "+c);
		 }
	  }
}
