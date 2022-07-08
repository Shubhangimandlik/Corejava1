package com.java;
import java.util.Scanner;
public class String {

	public static void main(java.lang.String[] args) {
		
		int words=1,characters=1;
		
		
		 Scanner sc1=new Scanner(System.in); 
		   // int i=sc1.nextInt();
		    
		System.out.println("Enter the String  ");
		String str =sc1.nextLine();
		for(int i=0; i<str.length()-1; i++)
		{
		char ch=str.charAt(i);
		 if(str.charAt(i)==' '&& str.charAt(i+1)!=' ' )
		 {
		        words ++;
		    }
		 else if(str.charAt(i)!=' ')
		 {
			 characters++;
		 }
		}
		System.out.println("Total words : "+words);
		System.out.println("Total characters : "+characters);
		
		System.out.println("Total  space : "+(words-1));

				
	}

}
