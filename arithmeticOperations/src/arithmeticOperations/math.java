package arithmeticOperations;

import java.util.Scanner;

public class math {
//	first method
	public static int subtractNumbers(int num1, int num2) {
		return num1-num2;
		
	}
//	second method
	public static int multiplyNumbers(int num1, int num2) {
		return num1*num2;
		
	}
//	third method
	public static double divideNumbers(int num1, int num2) {
		return num1/num2;
		
	}
//	fourth method
	public static int findRemainder(int num1, int num2) {
		return num1%num2;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 2 numbers ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println(subtractNumbers(num1, num2));
		System.out.println(multiplyNumbers(num1, num2));
		System.out.println(divideNumbers(num1, num2));
		System.out.println(findRemainder(num1, num2));

	}

}
