package doubletrouble;

import java.util.Scanner;

public class trouble {
	public static int doubleTheNumber(int num) {
		return num*2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to be doubled ");
		int num=sc.nextInt();
		System.out.println(doubleTheNumber(num));

	}

}
