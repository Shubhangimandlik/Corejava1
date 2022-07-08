package com.java;
import java.util.*;
public class Switch_case {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner operation = new Scanner(System.in);

		double num1, num2, answer;
		char Operation;
        System.out.println("*****Simple Calculator*****");
		System.out.println("+ Addition");
		System.out.println("- Subtraction");
		System.out.println("* Multiplication");
		System.out.println("/ Division");
		System.out.println("% Modulus");
		System.out.println("\n");

		System.out.print("Enter the operation to perform : ");
		Operation = operation.next().charAt(0);

		switch (Operation) {
		case '+':
			System.out.print("Enter first number:");
			num1 = input.nextInt();

			System.out.print("Enter the second number: ");
			num2 = input.nextInt();

			answer = num1 + num2;

			System.out.print(num1 + " + " + num2 + " = " + answer+"\nThe Addition operation is performed successfully.");

			break;
		case '-':
			System.out.print("Enter first number: ");
			num1 = input.nextInt();

			System.out.print("Enter the second number: ");
			num2 = input.nextInt();

			answer = num1 - num2;

			System.out.print(num1 + " - " + num2 + " = " + answer+"\nThe Substraction operation is performed successfully.");

			break;
		case '*':
			System.out.print("Enter first number: ");
			num1 = input.nextInt();

			System.out.print("Enter the second number: ");
			num2 = input.nextInt();

			answer = num1 * num2;

			System.out.print(num1 + " * " + num2 + " = " + answer+"\nThe Multiplication operation is performed successfully.");

			break;
		case '/':
			System.out.print("Enter first number: ");
			num1 = input.nextInt();

			System.out.print("Enter the second number: ");
			num2 = input.nextInt();

			answer = num1 / num2;

			System.out.print(num1 + " / " + num2 + " = " + answer+"\nThe Division Operation is performed successfully.");

			break;

		case '%':
			System.out.print("Enter first number: ");
			num1 = input.nextInt();

			System.out.print("Enter the second number: ");
			num2 = input.nextInt();

			answer = num1 % num2;

			System.out.print(num1 + " % " + num2 + " = " + answer+"\nThe Modulus Operation is performed successfully.");

			break;
		default:
			System.out.println("Invalid operator!");
			break;
		}
	}
}