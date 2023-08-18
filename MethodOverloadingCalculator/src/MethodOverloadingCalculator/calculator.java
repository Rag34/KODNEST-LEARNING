package MethodOverloadingCalculator;

import java.util.Scanner;

public class calculator {
	static double addition(int a,int b) {
		return a+b;
	}
	
	static double subtraction(int a,int b) {
		return a-b;
	}
	
	static double multiply(int a,int b) {
		return a*b;
	}
	
	static double division(int a,int b) {
		return a/b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number..");
		int a=sc.nextInt();
		System.out.println("Enter the second number: ");
		int b=sc.nextInt();
		System.out.println("Enter the operator (+, -, *, /): ");
		String op=sc.next();
		switch(op) {
		case "+":
			System.out.println("Res:"+addition(a, b));
			break;
		case "-":
			System.out.println("Res:"+subtraction(a, b));
			break;
		case "*":
			System.out.println("Res:"+multiply(a, b));
			break;
		case "/":
			System.out.println("Res:"+division(a, b));
			break;
			default:
				System.out.println("enter the correct operand..");
		}
	}

}
