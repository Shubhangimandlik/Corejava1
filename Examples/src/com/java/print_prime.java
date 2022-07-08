package com.java;
import java.util.*;
public class print_prime {

	public static void main(String[] args) {
		
				Scanner sc=new Scanner(System.in);
				int n,i,cnt,j;
				
				System.out.println("Enter a number");
				n=sc.nextInt();
				for(i=2;i<=n;i++);
				{ 
					cnt=0;
					for(j=1;j<=1;j++)
					{
					if(i%j==0)
					cnt++;
				      
					} 
					
				}
		        if(cnt==2)
		        
		        	System.out.print(i+" ");
		        
			}


		

	}


