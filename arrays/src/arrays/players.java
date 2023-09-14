package arrays;

import java.util.Scanner;

public class players {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double height[]=new double[10];
		for(int i=0;i<=height.length-1;i++) {
			System.out.println("enter the height of the players...");
			height[i]=sc.nextDouble();
		}
		System.out.println("the employee names are......");
		for(int i=0;i<=height.length-1;i++) {
			System.out.print(height[i]+" ");
		}
		
		

	}

}
