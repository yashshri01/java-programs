package com.deatil;
import java.util.*;
public class Operation {
	public static void getTata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("select 1 for Altroz \nselect 2 for Safari");
		int ch = sc.nextInt();
		Tata td = new Tata();
		switch(ch) {
		case 1:
			td.getAltrozInfo();
			break;
		case 2:
			td.getSafariInfo();
		}
	}
	
	public static void getToyata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("select 1 for Camry \nselect 2 for Hilux");
		int ch = sc.nextInt();
		Toyata ts = new Toyata();
		switch(ch) {
		case 1:
			ts.getCamryInfo();
			break;
		case 2:
			ts.getHiluxInfo();
		}
	}
	
	
	public static void getMahindra() {
		Scanner sc = new Scanner(System.in);
		System.out.println("select 1 for Camry \nselect 2 for Hilux");
		int ch = sc.nextInt();
		Mahindra tp = new Mahindra();
		switch(ch) {
		case 1:
			tp.getSwiftInfo();
			break;
		case 2:
			tp.getTharInfo();
		}
	}
}
