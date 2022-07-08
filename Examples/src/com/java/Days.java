package com.java;
import java.util.*;
public class Days {

	public static void main(String[] args) {
		System.out.println("Enter a day");
		int week=4;
		String day;
		switch(week)
		{
		case 1:
			day="Sunday";
			break;
		case 2:
			day="Monday";
			break;
		case 3:
			day="Tuesday";
			break;
		case 4:
			day="Wednesday";
			break;
		case 5:
			day="Thursday";
			break;
		case 6:
			day="Friday";
			break;
		case 7:
			day="Saturday";
			break;
		 default:
			System.out.println("Invalid day");
			break;
		}
	}

}
