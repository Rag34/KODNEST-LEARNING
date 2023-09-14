package arrays;

import java.util.Scanner;

public class games {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double game[][]=new double[5][];
		game[0]=new double[3];
		game[1]=new double[2];
		game[2]=new double[4];
		game[3]=new double[2];
		game[4]=new double[3];
		
		//inputs
		for(int i=0;i<=game.length-1;i++) {
			for(int j=0;j<=game[i].length-1;j++) {
				System.out.println("enter game "+i+" player"+j+" height");
				game[i][j]=sc.nextDouble();
			}
		}
		//outputs
		System.out.println("the heights of the players are...");
		for(int i=0;i<=game.length-1;i++) {
			for(int j=0;j<=game[i].length-1;j++) {
				System.out.print(game[i][j]+" | ");
			}
			System.out.println();
		}
		
		

	}

}
