package theCalculatorDilemma;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers....");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		System.out.println("enter the operation to perform..");
		System.out.println("+  -  *  / ");
		String ch=sc.next();
		switch(ch) {
		case "+":
			System.out.println(a+b);
			break;
		case "-":
			System.out.println(b-a);
			break;
		case "*":
			System.out.println(a*b);
			break;
		case "/":
			System.out.println(b/a);
			break;
			default:
				System.out.println("enter the correct operator...");
		}
		
		
	}

}
