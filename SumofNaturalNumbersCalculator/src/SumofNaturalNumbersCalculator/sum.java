package SumofNaturalNumbersCalculator;

import java.util.Scanner;

public class sum {
	public static void calculateSum(int n) {
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		calculateSum(n);
		

	}

}
