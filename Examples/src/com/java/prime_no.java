package com.java;
import java.util.*;
public class prime_no {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,cnt=0;
		
		System.out.println("Enter a number");
		n=sc.nextInt();
		for(i=2;i<=n;i++);
		{
			if(n%i==0)
			{
				cnt++;
		      
			} 
			
		}
        if(cnt==0)
        
        	System.out.println(n+"is prime number");
        
        else
        
        	System.out.println(n+"is not prime number");
        
	}


}
