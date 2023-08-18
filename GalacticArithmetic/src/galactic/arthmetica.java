package galactic;

import java.util.Scanner;

public class arthmetica {
	public static long galacticAddition(long num1, long num2) {
		return num1+num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 numbers....");
		long num1=sc.nextLong();
		long num2=sc.nextLong();
		System.out.println(galacticAddition(num1, num2));
		

	}

}
