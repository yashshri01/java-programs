package com.car;
import java.util.*;
public class Test {
	static {
		System.out.println("!Welcome to car company!");
	}
	public static void main(String[] args) {
		System.out.println("Choose Car Company:-");
		System.out.println("press 1 for MarutiSuzuki \npress 2 for Tata \npress 3 for BMW");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Congrts you have choosed MarutiSuzuki");
			Operation.getMarutiSuzuki();
			break;
		case 2:
			System.out.println("Congrts you have choosed MarutiSuzuki");
			Operation.getTata();
			break;
		case 3:
			System.out.println("Congrts you have choosed MarutiSuzuki");
			Operation.getBMW();
			break;
		}
		
		
	}
}
