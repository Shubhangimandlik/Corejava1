package if_condition;
import java.util.*;
public class chk_digit_orNot {

	public static void main(String[] args) {
		char ch;
		String s1;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter character");
		s1=sc.next();
		ch=s1.charAt(0);
		if((ch>='0' && ch<='9'))
		{
			System.out.println(ch + " is digit");
		}
		else
		{
			System.out.println(ch + " is not digit");
		}	

	}

}
