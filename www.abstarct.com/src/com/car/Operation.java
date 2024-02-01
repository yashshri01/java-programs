package com.car;

import java.util.Scanner;

public class Operation {
	public static void getMarutiSuzuki() {
		Scanner sc = new Scanner(System.in);
		System.out.println("select 1 for Swift \nselect 2 for Balaro");
		int ch = sc.nextInt();
		Swift al =new Swift();
		Balaro sa = new Balaro();
		switch(ch) {
		case 1:
			al.getMSdealers();
			al.getMillage();
			al.getColors();
			al.getPrice();
			al.getFeature();
			break;
		case 2:
			sa.getMSdealers();
			sa.getMillage();
			sa.getColors();
			sa.getPrice();
			sa.getFeature();
		}
	}
	
	
	public static void getTata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("select 1 for Safari \nselect 2 for Nexon");
		int ch = sc.nextInt();
		Safari al =new Safari();
		Nexon sa = new Nexon();
		switch(ch) {
		case 1:
			al.getTatadealers();
			al.getMillage();
			al.getColors();
			al.getPrice();
			al.getFeature();
			break;
		case 2:
			sa.getTatadealers();
			sa.getMillage();
			sa.getColors();
			sa.getPrice();
			sa.getFeature();
		}
	}
	
	
	public static void getBMW() {
		Scanner sc = new Scanner(System.in);
		System.out.println("select 1 for Bmw6series \nselect 2 for Bmwi5");
		int ch = sc.nextInt();
		Bmw6series al =new Bmw6series();
		Bmwi5 sa = new Bmwi5();
		switch(ch) {
		case 1:
			al.getBMWdealers();
			al.getMillage();
			al.getColors();
			al.getPrice();
			al.getFeature();
			break;
		case 2:
			sa.getBMWdealers();
			sa.getMillage();
			sa.getColors();
			sa.getPrice();
			sa.getFeature();
		}
	}
}
