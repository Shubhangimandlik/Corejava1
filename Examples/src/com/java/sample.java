package com.java;

public class sample {
	static int num2=99;
	public static void main(String[] args) {

		int num=96;
		method1();
		
		System.out.println("num1 is "+ sample.num2);
		System.out.println(num2);
	}
		public static void method1() {
		
			int num2=99;
		
		System.out.println("instance variable"+(++num2));
	}


}