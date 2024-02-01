package com.b;

import com.a.First;

public class Third {
	public static void main(String[]args) {
		First obj = new First();
		System.out.println("Private:"+obj.pv);
		System.out.println("default"+obj.def);
		System.out.println("public:"+obj.pb);
		System.out.println("protected:"+obj.pt);
	}
}
//private, default, and protected not accessed in another package
// only public is accessed in another package