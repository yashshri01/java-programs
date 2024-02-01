package com.symbiosis.login;

public class Second {
	public static void main(String[] args) {
		//implicit type casting
		byte a=10;
		int d= a;
		System.out.println(d);// small size data type converted to large size
		
		
		//int r=20;
		//byte rt = r;// but large size not in small
		
		//explicit type casting
		int r=140;
		byte rt =(byte) r;
		System.out.println(rt);
		
		short c = 3276;
		float b = 10.4f;
		double l= 20.6;
		char e='a';
		char t= 84;
		System.out.println(t);
		boolean z = false;
	}
}