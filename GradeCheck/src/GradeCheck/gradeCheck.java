package GradeCheck;

import java.util.Scanner;

public class gradeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();
		gcheck(marks);
		

	}
	public static void gcheck(int marks) {
		if(marks>50) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	}

}
