package com.data;

public class Conditional {
	public static void main(String [] args) {
	int a =10;
	if (a==20) {
		System.out.println("true print if");
	}
	else if(a++==10) {
		System.out.println("(if) not true then print (else-if) ");
	}
	else {
		System.out.println("(if) and (else-if) not true then print (else)");
	}
	}
}
