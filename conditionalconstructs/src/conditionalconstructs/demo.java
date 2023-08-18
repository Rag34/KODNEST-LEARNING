package conditionalconstructs;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	int a = 2;
	        int b = 2;
	        int c = 2;
	 
	        if (a == b) {
	 
	            // nested if else condition to check if c is equal to a and b
	            if (a == c) {
	                // all are equal
	                System.out.println("Equal");
	            } else {
	                // a!=c
	                System.out.println("Not equal");
	            }
	        } else {
	            // a!=b
	            System.out.println("Not equal");
	        }
	}

}
