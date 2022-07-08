package com.java;
import java.util.*;
public class armstrong_no {

	public static void main(String[] args) {
		int n, number, temp, total = 0;
        System.out.println("Ënter Number");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        
        number = n;

        for( ;number!=0;number /= 10)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
        }

        if(total == n)
            System.out.println(n + " is an Armstrong number");
        else
            System.out.println(n+ " is not an Armstrong number");

     
	}

}
