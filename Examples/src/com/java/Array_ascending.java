package com.java;

import java.util.Scanner;

public class Array_ascending {

	public static void main(String[] args) {
		 int i,j,n,temp;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter no of array element ");
			int a[]= new int[10];
			n=sc.nextInt();
			System.out.println("Enter all array element ");
			
			for ( i = 0; i < n; i++) 
	        {
	            a[i] = sc.nextInt();
	        }
	        for ( i = 0; i < n; i++) 
	        {
	            for (j = i + 1; j < n; j++) 
	            {
	                if (a[i] > a[j]) 
	                {
	                    temp = a[i];
	                    a[i] = a[j];
	                    a[j] = temp;
	                }
	            }
	        }
	        System.out.print("Ascending Order:");
	        for ( i = 0; i < n - 1; i++) 
	        {
	            System.out.print(a[i] + ",");
	        }
	        System.out.print(a[n - 1]);
}

	}

