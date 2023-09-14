package arrays;

import java.util.Scanner;

public class employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name[]=new String[8];
		for(int i=0;i<=name.length-1;i++) {
			System.out.println("enter the employee name...");
			name[i]=sc.nextLine();
		}
		System.out.println("the employee names are......");
		for(int i=0;i<=name.length-1;i++) {
			System.out.print(name[i]+" ");
		}

	}

}
