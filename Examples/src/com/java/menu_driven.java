package com.java;
import java.util.*;

public class menu_driven {

	public static void main(String[] args) {

			double num1, num2, answer;
			char Operation;
			Scanner input = new Scanner(System.in);
			Scanner operation = new Scanner(System.in);
	        do
	        {
	        System.out.println("\n---Simple Calculator---");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4.Division");
			System.out.println("5. Modulus");
			System.out.println("6. Exit");
			System.out.println("\n");

			System.out.print("Enter the operation to perform : ");
			Operation = operation.next().charAt(0);

			switch (Operation) {
			case '1':
				System.out.print("Enter first number:");
				num1 = input.nextInt();

				System.out.print("Enter the second number: ");
				num2 = input.nextInt();

				answer = num1 + num2;

				System.out.print(num1 + " + " + num2 + " = " + answer+"\nThe Addition operation is performed successfully.\n");

				break;
			case '2':
				System.out.print("Enter first number: ");
				num1 = input.nextInt();

				System.out.print("Enter the second number: ");
				num2 = input.nextInt();

				answer = num1 - num2;

				System.out.print(num1 + " - " + num2 + " = " + answer+"\nThe Substraction operation is performed successfully.\n");

				break;
			case '3':
				System.out.print("Enter first number: ");
				num1 = input.nextInt();

				System.out.print("Enter the second number: ");
				num2 = input.nextInt();

				answer = num1 * num2;

				System.out.print(num1 + " * " + num2 + " = " + answer+"\nThe Multiplication operation is performed successfully.\n");

				break;
			case '4':
				System.out.print("Enter first number: ");
				num1 = input.nextInt();

				System.out.print("Enter the second number: ");
				num2 = input.nextInt();

				answer = num1 / num2;

				System.out.print(num1 + " / " + num2 + " = " + answer+"\nThe Division Operation is performed successfully.\n");

				break;

			case '5':
				System.out.print("Enter first number: ");
				num1 = input.nextInt();

				System.out.print("Enter the second number: ");
				num2 = input.nextInt();

				answer = num1 % num2;

				System.out.print(num1 + " % " + num2 + " = " + answer+"\nThe Modulus Operation is performed successfully.\n");

				break;
			case '6':
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid operator!\n");
				break;
			}
			}while(Operation!=6);
	        }
	}