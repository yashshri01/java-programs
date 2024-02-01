package com.symbiosis.login;

public class Staticmethod {
	public static void m1() {
		System.out.println("inside m1");
	}
	public void m2() {
		System.out.println("inside m2");
	}
	
	public static void main(String[] args) {
		Staticmethod.m1(); //static method can be accessed without object using class
		Staticmethod.m2(); //non static method always require object for accessing
		
		Staticmethod obj = new Staticmethod();
		obj.m2();
		obj.m1(); //static method can be accessed using non static way but it 
					// is mandatory to access only using non static way that is by class
	}
}
