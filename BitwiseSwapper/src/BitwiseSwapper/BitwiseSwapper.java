package BitwiseSwapper;

import java.util.Scanner;

public class BitwiseSwapper {
	public static void swapUsingBitwise(int a,int b) {
		System.out.println("Values before swapping..");
		System.out.println("a= "+a+", "+"b= "+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("Values after swapping..");
		System.out.println("a= "+a+", "+"b= "+b);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first value..");
		int a=sc.nextInt();
		System.out.println("enter the second value..");
		int b=sc.nextInt();
		swapUsingBitwise(a, b);
		

	}

}
