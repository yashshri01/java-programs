package com.a;

public class Con1 {
	{
		System.out.println("non-static block");
	}
	Con1(){
		System.out.println("constructor");
	}
	static {
		System.out.println("static block");
	}
	
}
