package theTemperatureConverter;

import java.util.Scanner;

public class TemperatureConverter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the temperature value in Fahrenheit.....");
		double ftemp=sc.nextDouble();
		TemperatureConverters temperatureConverter = new TemperatureConverters();
		double res=temperatureConverter.convertFahrenheitToCelsius(ftemp);
		System.out.println(res);
	}
}
