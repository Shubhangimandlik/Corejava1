package com.java;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int num[]= new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array element ");
			for(int i=0;i<num.length;i++)
			{
				num[i]=sc.nextInt();
			}
		System.out.println(" element in a array");
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
		
	}

}
