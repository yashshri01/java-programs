package com.symbiosis.login;

public class Method {
	public void m1() {
		System.out.println("inside m1");
	}
	public int m2() { //m2 is method
		return 10;
	}
	public boolean m3() {
		return true;
	}
	public float m4() {
		return 3.4f;
	}
	public static void main (String [] args) {
		Method obj = new Method(); //Method() is constructor
		obj.m1();
	}
}
