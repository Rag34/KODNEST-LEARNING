package taxCalculator;

import java.util.Scanner;

public class taxcalculator {
	public static double calculateTotalWithTax(double purchaseAmount,double taxRate) {
		
		return purchaseAmount*taxRate;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the purchase amount: ");
		double purchaseAmount=sc.nextDouble();
		System.out.println("Enter the tax rate (in decimal form): ");
		double trate=sc.nextDouble();
		double res=calculateTotalWithTax(purchaseAmount, trate);
		System.out.println("Total cost including tax: "+(purchaseAmount+res));
	}

}
