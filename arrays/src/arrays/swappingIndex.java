package arrays;

import java.util.Scanner;

public class swappingIndex {
	static void swap(int arr[],int index1,int index2) {
		int temp=arr[index1];
			arr[index1]=arr[index2];
			arr[index2]=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of array...");
		int arr[]=new int[sc.nextInt()];
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("before swapping...");
		System.out.println("Arr-->>");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("enter first index....");
		int index1=sc.nextInt();
		System.out.println("enter second index....");
		int index2=sc.nextInt();
		if(index1>=0&&index1<=arr.length&&index2>=0&&index2<=arr.length) {
			swap(arr, index1, index2);
		}
		System.out.println("after swapping...");
		System.out.println("Arr-->> ");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
