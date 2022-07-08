package com.java;

import java.util.Arrays;

public class Array_methods {

	public static void main(String[] args) {
		int a[]= {1,3,5,4,8,6};
		String arr[]= {"Black","White","Red","pink"};
		String arr1[]=Arrays.copyOf(arr, 4);
		System.out.println("Sorted Array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
			
		}
  System.out.println(" ");
     for(int i=0; i<arr1.length;i++)
     {
    	 System.out.println(arr[i]+" ");
     }
     boolean result=Array.equals(arr,arr1);
 System.out.println("Equal Result:"+result);     
	}

}
