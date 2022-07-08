package com.java;

import java.util.Scanner;

public class Chk_pos_neg {

	public static void main(String[] args) {
		int cnt_p=0,cnt_n=0,cnt_z=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int length=sc.nextInt();
		int a[]=new int[length];
		System.out.println("Enter the number:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				cnt_p++;
			}
			else if(a[i]==0)
			{
				cnt_z++;
			}
			else
			cnt_n++;
		}
		System.out.println("Count of positive :"+cnt_p);
		System.out.println("Count of negative :"+cnt_n);
		System.out.println("Count of zero :"+cnt_z);
	}

}
