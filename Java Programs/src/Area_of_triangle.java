import java.util.*;
public class Area_of_triangle {
	
	
		public static void main(String[] args) 
		{
			double b,h,A;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter value of b & h");
			b=sc.nextDouble();
			h=sc.nextDouble();
			A=0.5*b*h;
			System.out.println("Area of triangle="+A);		
		}
	}


