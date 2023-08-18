package fibonacci;

import java.util.Scanner;

public class fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int c;
		 System.out.println("enter a number...");
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}

	}

}
