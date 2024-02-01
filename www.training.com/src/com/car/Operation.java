package com.car;
import java.util.*;

public class Operation {
	public static void getTata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("select 1 for Altroz \nselect 2 for Safari");
		int ch = sc.nextInt();
		Altroz al =new Altroz();
		Safari sa = new Safari();
		switch(ch) {
		case 1:
			al.AltrozFeature();
			al.TataFeature();
			break;
		case 2:
			sa.SafariFeature();
			sa.TataFeature();
		}
	}
	
	
	public static void getBMW() {
		Scanner sc = new Scanner(System.in);
		System.out.println("select 1 for BMWX4 \nselect 2 for BMWXM");
		int ch = sc.nextInt();
		BMWX4 al =new BMWX4();
		BMWXM sa = new BMWXM();
		switch(ch) {
		case 1:
			al.BMWX4Feature();
			al.BMWFeature();
			break;
		case 2:
			sa.BMWXMFeature();
			sa.BMWFeature();
		}
	}
	
	
	
	public static void getMahindra() {
		Scanner sc = new Scanner(System.in);
		System.out.println("select 1 for Thar \nselect 2 for Scarpio");
		int ch = sc.nextInt();
		Thar al =new Thar();
		Scarpio sa = new Scarpio();
		switch(ch) {
		case 1:
			al.TharFeature();
			al.MahindraFeature();
			break;
		case 2:
			sa.ScarpioFeature();
			sa.MahindraFeature();
		}
	}
}


