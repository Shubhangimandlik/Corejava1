package com.java;
import java.util.*;
public class String_palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String rev="";
		for(int i=str.length()-1;i>=0;--i)
		{
			rev=rev+str.charAt(i);
			
		}

	}

}
