package logicalOperatorValidator;

import java.util.Scanner;

public class LogicalOperatorValidator {
	public static boolean isValidInput(boolean valid,boolean condition) {
		if(valid==true&&condition==true) {
			System.out.println("Input is valid...");
		}else {
			System.out.println("Input is Invalid");
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Is input valid (true/false): ");
		boolean valid=sc.nextBoolean();
		System.out.println("Does input meet a certain condition (true/false): ");
		boolean condition=sc.nextBoolean();
		isValidInput(valid, condition);
		
		

	}

}
