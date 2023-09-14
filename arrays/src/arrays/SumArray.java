package arrays;

import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array 1 length");
		int arr1[]=new int[sc.nextInt()];
		int arr2[]=new int[arr1.length];
		int arr3[]=new int[arr1.length];
		System.out.println("enter the array 1 elements");
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=sc.nextInt();
//			arr3[i]=arr1[i];
		}
		System.out.println("enter the arrray 2 elements..");
		for(int i=0;i<=arr1.length-1;i++) {
			arr2[i]=sc.nextInt();
			arr3[i]=arr1[i]+arr2[i];
			
		}
		System.out.println("the sum of corresponding elements are....");
		for(int i=0;i<=arr3.length-1;i++) {
			System.out.print(arr3[i]+" ");
		}
		sc.close();

	}

}
