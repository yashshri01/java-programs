package com.symbiosis.login;

public class Xyz {
	public void m1() {
		System.out.println("inside m1");
	}
	public void m2() {
		Xyz obj = new Xyz();
		obj.m1();
	}
	public static void main(String []args) {
		Xyz obj = new Xyz();
		obj.m2();
	}
	//method m1 called from method m2
}
