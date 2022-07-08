package com.java;
import java.util.*;
public class Fibonacci_series {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int f1 = 0, f2 = 1;
        System.out.print("Enter the number of terms: ");
        int n=sc.nextInt(); 
        System.out.println("First " + n + " terms of fibonnaci series: ");
    
        for (int i = 1; i <= n; i++)
        {
            System.out.print(f1 + " ");
            int sum = f1 + f2;
            f1 = f2;
            f2 = sum;
        }


	}

}
