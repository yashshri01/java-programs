package com.deatil;
import java.util.*;
public class Car {
	static {
		System.out.println("WELCOME");
	}
		
	public static void main(String[] args) {
		System.out.println("Choose a car company from:");
		System.out.println("select 1 for Tata \nselect 2 for Toyata \nselect 3 for Mahindra");
		System.out.println("Enter car company:");
		Scanner sc= new Scanner(System.in);
		int car = sc.nextInt();
		
		switch (car) {
		case 1:
			System.out.println("Welcome to Tata");
			Operation.getTata();
			break;
		case 2:
			System.out.println("Welcome to Toyata");
			Operation.getToyata();
			break;
		case 3:
			System.out.println("Welcome to Mahindra");
			Operation.getMahindra();
			break;
		default:
			System.out.println("enter valid choice");
		}
		}
}
