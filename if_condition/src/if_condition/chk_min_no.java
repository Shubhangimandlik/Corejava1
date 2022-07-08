package if_condition;
import java.util.*;

public class chk_min_no {
	public static void main(String[] args) 
	{
		int n,n1;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter 2  number");
		n=sc.nextInt();
		n1=sc.nextInt();
		if(n<n1)
		{
		 System.out.println(n+" is min");

		}
		else if(n1<n)
		{

			 System.out.println(n1+" is min");

		}
		else 

		{
			System.out.println("euquals");

		}
		

	}

}
