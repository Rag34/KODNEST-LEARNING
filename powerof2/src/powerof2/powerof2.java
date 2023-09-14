package powerof2;

import java.util.Scanner;

public class powerof2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		logic l1=new logic();
		int res=l1.power(num);
		System.out.println(res);

	}

}
