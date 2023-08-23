package PrimeNumbersPrinter;

import java.util.Scanner;

public class primenum {
	public static void printPrimes(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}if(count==2) {
				System.out.print(i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printPrimes(n);

	}

}
