package theStringJoiner;

import java.util.Scanner;

public class joiner {
	public static String joinStrings(String str1, String str2) {
		return str1+" "+str2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first string...");
		String str1=sc.next();
//		sc.nextLine();
		String str2=sc.next();
		System.out.println(joinStrings(str1, str2));
		

	}

}
