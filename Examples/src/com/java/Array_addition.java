package com.java;

import java.util.Scanner;

public class Array_addition {

	public static void main(String[] args) {
	int row,col,i,j,row1,col1,a,b;
	int arr[][]=new int[10][10];
	int arr1[][]=new int[10][10];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the row element");
	row=sc.nextInt();
	System.out.println("Enter the col element");
	col=sc.nextInt();
	System.out.println("Enter"+(row+col)+"Array Elements:");
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)
		{
			arr[i][j]=sc.nextInt();
			
		}
	}
	System.out.println("The array is :");
	{
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	System.out.println("Enter the row element");
	row1=sc.nextInt();
	System.out.println("Enter the col element");
	col1=sc.nextInt();
	
	System.out.println("Enter"+(row1+col1)+"Array Elements:");
	for(a=0;a<row;a++)
	{
		for(b=0;b<col;b++)
		{
			arr[a][b]=sc.nextInt();
			
		}
	}
	System.out.println("The array is :");
	{
		for(a=0;a<row;a++)
		{
			for(b=0;b<col;b++)
			{
				System.out.print(arr1[a][b]+" ");
			}
			System.out.println();
		}
	}
	}

}
