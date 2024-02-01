package com.poly;

public class First {
	public void m1() {
		System.out.println("no parameter");
	}
	public void m1(int a) {
		System.out.println("int parameter");
	}
	public void m1(int a, int b) {
		System.out.println("in t1, int2 parameter");
	}
	
	public static void main(String[]args) {
		First fs=new First();
		fs.m1();
		fs.m1(10);
		fs.m1(10, 20);
	}
}
