package FactorialCalculator;

import java.util.Scanner;

public class factorial {
	public static void calculateFactorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		calculateFactorial(n);
		

	}

}
