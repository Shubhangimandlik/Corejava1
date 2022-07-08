package com.java;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		
		int i,n,j,k=1;
		Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+k++);
			}
			System.out.println();
			
	}
		
	}
}

