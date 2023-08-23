package NumberTablePrinter;

import java.util.Scanner;

public class mutitable {
	public static void printTable(int num) {
		for(int i=1;i<=10;i++) {
			System.out.println(num+""+" x"+i+" ="+(num*i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		printTable(num);

	}

}
