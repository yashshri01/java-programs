package com.data;

public class Variable {
	static int a=10;// it can't be local 
	
	public static void m1() {
		 
		//Variable ab = new Variable();
		//System.out.println(ab.a);----------non static by static
		System.out.println(a);
	}
	
	public static void main(String [] args) {
		Variable obj = new Variable();
		obj.m1();
		//non static variable accessed by     non static method
		// static    variable accessed by     non static method
		//static     variable accessed by     static method
		//non static variable not accessed by static method => create object in method
		
	}
}
