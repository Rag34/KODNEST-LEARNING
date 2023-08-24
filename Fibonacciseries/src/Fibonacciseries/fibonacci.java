package Fibonacciseries;

import java.util.Scanner;

public class fibonacci {
	public static void printFibonacciSeries(int n)
	{
	// your code here    0 1 1 2 3 5 8 13 21.........
		int a=0,b=1,c;
		for(int i=1;i<=n;i++) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printFibonacciSeries(n);
		

	}

}
