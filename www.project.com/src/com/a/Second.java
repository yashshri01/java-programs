package com.a;

public class Second {
	public static void main(String[]args) {
		First obj = new First();
		System.out.println("Private:"+obj.pv);
		System.out.println("default"+obj.def);
		System.out.println("public:"+obj.pb);
		System.out.println("protected:"+obj.pt);
	}
}
//private is only accessed in same class