package com.symbiosis.login;

public class first {
	int a = 10; //Global variable
	
	public void m1(int b){
		b=30; //Local variable
		System.out.println(a);
		System.out.println(b);
	}
	public void m2() {
		System.out.println(a);
		System.out.println(b);
	}

}
