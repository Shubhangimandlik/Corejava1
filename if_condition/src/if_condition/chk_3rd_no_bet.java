package if_condition;
import java.util.*;
import java.util.Scanner;

public class chk_3rd_no_bet {
	
		  public static void main(String args[])
		  {
			 int a,b,c;
			 Scanner sc=new Scanner(System.in);
			 System.out.println("Enter 3 numbers");
			 a=sc.nextInt();
			 b=sc.nextInt();
			 c=sc.nextInt();
			 
			 if(c>a && c<b)
			 { 
				 System.out.println(c+" is between "+ a +" and "+b);
			 }
			 else
			 {
				 System.out.println(c+" is not between "+ a +" and "+b);
			 }
		  }
	}

