package PalindromeChecker;

public class palindromec {
	public static void palindrome(int num) {
		int sum=0;
        int rev=0,ld;
            while(num>0){
                ld=num%10;
                sum=sum*10+ld;
                num=num/10;
            }
        if(num==sum)
        {
            System.out.println("is a palindrome...");
        }else {
            System.out.println("not a palindrome...");
        }
	}
}
