package Find;

import java.util.Scanner;
	
public class PalindromeString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input");
		
		String s  = sc.next();
		int len = s.length();
		String rev="";
		String x = s;
		for(int i=len-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome");
		}
		
		
		
	}
	
	
	
	
	
}