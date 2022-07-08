package com.java;
import java.util.*;
public class triangle {

	public static void main(String[] args) {
		int i,j,n;
		System.out.println("Enter a number");
  Scanner sc=new Scanner(System.in);
   n=sc.nextInt();
    for(i=0;i<n;i++)
    {
    	for(j=1;j<n-i;j++)
    	{
    		System.out.print(" ");
    	}
    	
    		for(int k=0;k<=i;k++)
    		{
    			System.out.print(" * ");
    		}
    		System.out.println();
    	}
    }
	
}
