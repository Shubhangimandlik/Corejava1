

	import java.util.*;


	public class AM_HM 
	{

		public static void main(String[] args)
		{
			double a,b,hm,am;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter value of a & b");
			a=sc.nextDouble();
			b=sc.nextDouble();
			am=(a+b)/2;
			hm=(a-b)/2;
			System.out.println("Arithmetic mean="+am);
			System.out.println("Harmonic mean="+hm);

		}

	}

