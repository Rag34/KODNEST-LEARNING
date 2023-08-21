package MultipleofTenChecker;

import java.util.Scanner;

public class main {
	public static void checkMultipleOfTen(int n)
	{
	// your code here
		if(n%10==0) {
			System.out.println("The number is a multiple of 10.");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		checkMultipleOfTen(n);
		
		

	}

}
