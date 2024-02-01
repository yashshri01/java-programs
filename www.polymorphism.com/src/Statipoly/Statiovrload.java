package Statipoly;

public class Statiovrload {
	public static void m1() {
		System.out.println("without parameter");
	}
	public static void m1(int a) {
		System.out.println("int parameter");
	}
	public static void m1(int a, String b) {
		System.out.println("int and string parameter");
	}
	public static void main(String[]args) {
		Statiovrload.m1();
		Statiovrload.m1(10);
		Statiovrload.m1(10,"abc");
	}
}
// overloading with static method