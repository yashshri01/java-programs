package com.data;

public class While {
	public static void main(String[] args) {
		int i=5;
		while(++i<20) {
			System.out.println(i);
			i++;
		}
	}
}
// int i=1; while(false) shows compile time error
//while(i++<20) print value from 6 to 18 with increament of 2