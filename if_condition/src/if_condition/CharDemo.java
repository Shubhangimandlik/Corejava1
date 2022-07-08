package if_condition;
import java.util.Scanner;

	public class CharDemo
	{
	public static void main(String[] args) 
		{
			char ch;
			String s1;
			Scanner sc=new Scanner (System.in);
			System.out.println("Enter character");
			s1=sc.next();//string accept
			ch=s1.charAt(0);
			if(ch=='a'|| ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
			{
				System.out.println(ch + " is vowel");
			}
			else
			{
				System.out.println(ch + " is not vowel");
			}		
		}
	}

