package com.a;

public class Run1 {
	static {
		System.out.println("inside static block= i'm one time only, you can't access me next time  ");
	}
	{
		System.out.println("non-static block");
	}
	Run1(){
		System.out.println("constructor");
	}
}
