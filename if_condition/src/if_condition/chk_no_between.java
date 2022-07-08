package if_condition;
import java .util.*;
public class chk_no_between {
	
	  public static void main(String args[])
	  {
		 int a,b,c;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter 3 numbers");
		 a=sc.nextInt();
		 b=sc.nextInt();
		 c=sc.nextInt();
		 
		 if(a>b && a<c)
		 { 
			 System.out.println(a +" is between "+ b +" and "+c);
		 }
		 else
		 {
			 System.out.println(a +" is not between "+ b +" and "+c);
		 }
	  }
	}


