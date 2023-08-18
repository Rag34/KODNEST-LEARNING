package theJourneyCalculator;

import java.util.Scanner;

public class JourneyCalculator {
	public double calculateDistance(double speed, double time) {
		return speed*time;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the speed value....");
		double spd=sc.nextDouble();
		System.out.println("enter the time value...");
		double t=sc.nextDouble();
		JourneyCalculator journeyCalculator = new JourneyCalculator();
		double res=journeyCalculator.calculateDistance(spd, t);
		System.out.println(res);

	}

}
