package com.car;
import java.util.*;

public class Car {
	static {
		System.out.println("Welcome to CAR SHOP:");
	}
	public static void main(String[]args) {
		System.out.println("select 1 for Tata \nselect 2 for BMW \nselect 3 for Mahindra");
		Scanner sc= new Scanner(System.in);
		int car = sc.nextInt();
		
		switch (car) {
		case 1:
			System.out.println("Welcome to Tata");
			Operation.getTata();
			break;
		case 2:
			System.out.println("Welcome to BMW");
			Operation.getBMW();
			break;
		case 3:
			System.out.println("Welcome to Mahindra");
			Operation.getMahindra();
		default:
			System.out.println("enter valid choice");
		}
	}
}
