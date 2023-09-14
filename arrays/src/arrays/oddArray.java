package arrays;

import java.util.Scanner;

public class oddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array length...");
		int arr[]=new int[sc.nextInt()];
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("odd numbers in array are...");
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]%2!=0) {
				System.out.print(arr[i]+" ");
			}
			
		}

	}

}
