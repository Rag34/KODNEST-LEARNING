package arrays;

import java.util.Scanner;

public class bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String names[][]=new String[5][6];
		for(int i=0;i<=names.length-1;i++) {
			for(int j=0;j<=names[i].length-1;j++) {
				System.out.println("enter the  bank "+i+"customer "+j+" name");
				names[i][j]=sc.next();
			}
		}
		System.out.println("the bank customers are..");
		for(int i=0;i<=names.length-1;i++) {
			for(int j=0;j<=names[i].length-1;j++) {
				System.out.print(names[i][j]+" | ");
			}
			System.out.println();
		}

	}

}
