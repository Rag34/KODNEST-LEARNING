package SumofDigitsCalculator;

import java.util.Scanner;

public class sum {
	public static void calculateSumOfDigits(int n)
	{
	// your code here
		int ld=0;
		int sum=0;
		while(n>0) {
			
			ld=n%10;
			sum=sum+ld;
			n=n/10;
		}
		System.out.println("the sum of digits is.. "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		calculateSumOfDigits(n);
		
		

	}

}
