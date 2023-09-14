package arrays;

import java.util.Scanner;

public class divBy5Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array length...");
		int arr[]=new int[sc.nextInt()];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("enter the "+ "element "+i);
			arr[i]=sc.nextInt();
			
		}
		System.out.println(" numbers which are divisible by 5 are...");
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]%5==0) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}
