package arrays;

import java.util.Scanner;

public class mergingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr1[]=new int[sc.nextInt()];
		int arr2[]=new int[sc.nextInt()];
		int arr3[]=new int[arr1.length+arr2.length];
		System.out.println("enter the array 1 elements");
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=sc.nextInt();
			arr3[i]=arr1[i];
		}
		System.out.println("enter the arrray 2 elements..");
		for(int i=0;i<=arr1.length-1;i++) {
			arr2[i]=sc.nextInt();
			arr3[arr1.length+i]=arr2[i];
			
		}
		System.out.println("after merging....");
		for(int i=0;i<=arr3.length-1;i++) {
			System.out.print(arr3[i]+" ");
		}
		
		
		
	}

}
