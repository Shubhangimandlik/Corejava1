


import java.util.*;//1
	public class division
	{
		@SuppressWarnings("resource")// for warning remove
		public static void main(String[] args) 
		{
			int a,b,c;
			Scanner sc=new Scanner(System.in);//2
			System.out.println("enter 2 numbers");
			a=sc.nextInt();//3 scanf cin
			b=sc.nextInt();
			c=a/b;
			System.out.println("Division="+c);		
		}
	}

