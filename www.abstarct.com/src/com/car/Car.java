package com.car;

public abstract class Car {
	public abstract void getMillage();
	public abstract void getColors();
	public abstract void getPrice();
	public abstract void getFeature();
	
	public void getCar() {
		System.out.println("MarutiSuzuki,Tata,BMW");
	}
	
}
// this car project model used to use method repetatively without creating them again with abstraction