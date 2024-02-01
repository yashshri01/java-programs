package com.data;

public class Switch {
	public static void main(String[] args) {
	int a=8;
	switch(a) {
	case 1+4:
		System.out.println("inside case 1");
	//break;
	case 7:
		System.out.println("inside case 2");
	//break;
	default:
		System.out.println("default");
	}
	}

}
//no same or duplicate case  => case 5 , case 1+4
//running flow is from top to down 
//if there is NO BREAK and 1,2,3 case present and you give input 1 it will print all case including default
// if there is NO BREAK and 1,2,3 case present and you give input 8 it will only print default
