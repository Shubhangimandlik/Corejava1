package com.java;
 import java.util.*;
public class reverse_no {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
  System.out.println("Enter a  number");
		int n,rev=0;
		n=sc.nextInt();
         
	    
	    System.out.println("Original Num: " + n);

	    
	    while(n != 0)
	    {
	    
	      
	      int digit = n % 10;
	      rev = rev* 10+digit;
	      n /= 10;
	    
	    }
	    System.out.println("Reversed Num: " + rev);
	  }

	}

