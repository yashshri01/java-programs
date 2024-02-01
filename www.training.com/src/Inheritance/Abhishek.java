package Inheritance;

public class Abhishek extends Prashant {
	public void setMango() {
		System.out.println("Mango");
	}
}

class Rohit extends Abhishek {
	public void setApple() {
		System.out.println("Apple");
	}
}

class Akshay extends Abhishek {
	public void setBanana() {
		System.out.println("Banana");
	}
}

/*class Anish extends Rohit and Akshay{
	public void setChikku() {
		System.out.println("Chikku");
	}
}
*/

// it is not possible to extends Rohit and Akshay both properties by Anish 
// i.e. multiple inheritance not supported in java