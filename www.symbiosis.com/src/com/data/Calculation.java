
package com.data;
import java.util.Scanner;
public class Calculation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		public void op() {
			System.out.println("enter num1");
			int num1 = sc.nextInt(); 
			System.out.println("enter num1");;
			int num2 = sc.nextInt(); 
		}
		System.out.println("1.Addition \n2.Substraction \n3.Multiplication \n4.Division");
		System.out.println("enter choice");
		int ch = sc.nextInt();
		
		switch (ch){
			case 1:
				System.out.println(num1+num2);
				break;
			case 2:
				System.out.println(num1-num2);
				break;
			case 3:
				System.out.println(num1*num2);
				break;
			case 4:
				System.out.println(num1/num2);
		}
		
	}
}
