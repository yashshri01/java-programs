package com.symbiosis.login;

public class Staticblock {
	
	public static void main(String[] args) {
		System.out.println("inside main method");
	}
	
	static {
		System.out.println("inside static block");
	}
	//when static block is present in class it runs before main method
}
