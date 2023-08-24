package gcd;

import java.util.Scanner;

public class gcd {
	public static void findGCD(int a, int b)
	{
	// your code here
		int g=0;
		for(int i=1;i<=b;i++) {
			if(a%i==0&&b%i==0) {
				g=i;
			}
		}
		System.out.println("The GCD of two numbers  "+g);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		findGCD(a, b);

	}

}
