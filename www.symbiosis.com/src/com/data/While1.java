package com.data;

public class While1 {
	public static void main(String [] args) {
		boolean a= true;
		int i=10;
		while(i<20) {
			if(i==15) {
				a=false;
			}
			else {
				System.out.println(i);
			}
			i++;
			
		}
	}
}
