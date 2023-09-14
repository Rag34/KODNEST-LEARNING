package arrays;

import java.util.Scanner;

public class students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int marks[]=new int[5];
		for(int i=0;i<=marks.length-1;i++) {
			System.out.println("enter the marks....");
			marks[i]=sc.nextInt();
		}
		System.out.println("the marks of the student are..");
		for(int i=0;i<=marks.length-1;i++) {
			System.out.print(marks[i]+" ");
		}
		

	}

}
