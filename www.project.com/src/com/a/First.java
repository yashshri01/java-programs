package com.a;

public class First {
	private String pv ="private";
	// access specifier -> return type -> variable name -> value
	String def ="default";
	public String pb ="public";
	protected String pt="protected";
	
	public static void main(String[]args) {
		First obj = new First();
		System.out.println("Private:"+obj.pv);
		System.out.println("default"+obj.def);
		System.out.println("public:"+obj.pb);
		System.out.println("protected:"+obj.pt);
	}
}
