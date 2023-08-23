package EvenNumberPrinter;

import java.util.Scanner;

public class even {
	public static void printEvenNumbers(int n) {
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
//			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printEvenNumbers(n);
		
	}

}
