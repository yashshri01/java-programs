package com.b;

import com.a.First;

public class Fourth extends First {
	public static void main(String[]args) {
		Fourth ob = new Fourth();
		System.out.println("protected:"+ob.pt);
	}
}
// to access protected in another package =>
//1)import class where protected is present
//2)extend the class where protected is present
//3)create object of current/child class to access protected 