package com.symbiosis.login;

public class Calculator {
	int a =20;
	int b =10;
	public void add() {
		System.out.println(a+b);
	}
	public void sub() {
		System.out.println(a-b);
	}
	public void mult() {
		System.out.println(a*b);
	}
	public void div() {
		System.out.println(a/b);
	}
	public void mod() {
		System.out.println(a%b);
	}
	public static void main(String[] args) {
		Calculator obj= new Calculator();
		obj.add();
		obj.sub();
		obj.mult();
		obj.div();
		obj.mod();
	}
}
