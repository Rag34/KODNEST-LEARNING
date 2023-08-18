package temperatureConversion;

import java.util.Scanner;

public class conversion {
	public static double celsiusToFahrenheit(double celsius) {
		return (celsius*9/5)+32;
		
	}
	
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit-32)*5/9;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to the Temperature Conversion Tool!");
		System.out.println("=======================================");
		System.out.println("Enter Your Choice:\r\n"
				+ "1. Convert Celsius to Fahrenheit\r\n"
				+ "2. Convert Fahrenheit to Celsius");
		int option=sc.nextInt();
		if(option==1) {
			System.out.println("enter the temperature in Celsius..");
			double celsius=sc.nextDouble();
			double res=celsiusToFahrenheit(celsius);
			System.out.println(celsius+"°C is equivalent to "+res+"°F");
			System.out.println("=======================================");
			
		}else if(option==2) {
			System.out.println("enter the temperature in fahrenheit..");
			double fahrenheit=sc.nextDouble();
			double res=fahrenheitToCelsius(fahrenheit);
			System.out.println(fahrenheit+"°F is equivalent to "+res+"°C");
			System.out.println("=======================================");
			
		}
		
		
		
		
		

	}

}
