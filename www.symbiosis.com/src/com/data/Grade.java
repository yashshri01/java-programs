package com.data;

public class Grade {
	public static void main(String[]args) {
		int m=670;
		if(m>75 & m<=100) {
			System.out.println("Distinction");
		}
		else if(60<m & m<75) {
			System.out.println("first class");
		}
		else if(50<m & m<65) {
			System.out.println("second class");
		}
		else if(30<m & m<50) {
			System.out.println("pass");
		}
		else if(m<35) {
			System.out.println("fail");
		}
		else {
			System.out.println("enter valid mark");
		}
	}
}
