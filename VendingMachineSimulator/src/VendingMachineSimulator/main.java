package VendingMachineSimulator;

import java.util.Scanner;

public class main {
	public static void getProduct(String productCode)

	{

	// your code here
		switch(productCode) {
		case "P01":
			System.out.println("CocaCola");
			break;
		case "P02":
			System.out.println("Pepsi");
			break;
		case "P03":
			System.out.println("Fanta");
			break;
		case "P04":
			System.out.println("Jaljeera");
			break;
		case "P05":
			System.out.println("MOuntainDew");
			break;
		case "P06":
			System.out.println("BoatGuava");
			break;
			default:
				System.out.println("Panaka");
		
		}
			

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String productCode=sc.next();
		getProduct(productCode);

	}

}
