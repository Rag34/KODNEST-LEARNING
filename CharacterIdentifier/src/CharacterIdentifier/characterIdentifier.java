package CharacterIdentifier;

import java.util.Scanner;

public class characterIdentifier {
	public static void identifyCharacter(char ch)
	{
		if(Character.isLowerCase(ch)){
	           if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
	                System.out.println("Lower-case vowel");                   
	           }else{
	            System.out.println("Lower-case Consonant");
	           }
	        }else if(Character.isUpperCase(ch)){
	            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
	                System.out.println("Upper-case vowel");                   
	           }else{
	            System.out.println("Upper-case Consonant");
	           }
	        }else if(Character.isDigit(ch)){
	            System.out.println(" It is a Digit");
	        }else {
	            System.out.println("Special Charecter");
	        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        char ch=sc.next().charAt(0);
	        identifyCharacter(ch);
		

	}

}
