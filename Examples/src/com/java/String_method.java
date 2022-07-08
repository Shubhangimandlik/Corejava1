package com.java;

public class String_method {

	public static void main(String[] args) {
		String s=new String("I like java");
		System.out.println("length  "+s.length());
		
		String s1="fsfsjkbc";
		System.out.println("Equals method   "+s.equals(s1));
		String s2="hello";
		String s3="Hello";
		System.out.println("equal   "+s2.equalsIgnoreCase(s3));
		s.replace("like", "love");
		String s4="     hii      ";
	   System.out.println("Trim  "+s4.trim());
	   
	   String str="Hello how are you";
	   String[] arrOfString=str.split(" ",4);
	   for(String a : arrOfStr)
		   System.out.println(a);
		}

}
