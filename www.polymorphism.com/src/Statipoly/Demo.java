package Statipoly;

public class Demo {
	
	public void m1() {
		System.out.println("inside m1");
	}
	Demo(int a){
		
	}
	//Demo(){
		
	//}
	
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.m1();
	}
}
// when we create class automatically default constructor is present in it=> that is Demo()
// parameterised constructor override default constructor.
// when we create Demo(int a) it will override Demo() and while creating object it shows error bcz
// for creating object we need to call Demo(), but it is overriden.
// We need to create Demo() seperately