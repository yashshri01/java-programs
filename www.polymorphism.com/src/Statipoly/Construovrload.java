package Statipoly;

public class Construovrload {
	Construovrload(){
		System.out.println("constructor without parameter");
	}
	Construovrload(int a){
		System.out.println("constructor with int  parameter");
	}
	public static void main(String[] args) {
		Construovrload col = new Construovrload();
		Construovrload co = new Construovrload(10);
		
	}
}
// constructor perform overloading
//constructor don't have return type 