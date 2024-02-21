package Find;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
	
//     Method 1
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number");
//		int num = sc.nextInt();
//		
//		StringBuffer sb = new StringBuffer(String.valueOf(num));
//		System.out.println(sb.reverse());
		
//      Method 2
		int num =12345678;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}System.out.println(rev);
		
	
		String s = "abcd";
		int len=s.length();
		String revv =""; 
		char ch;
		for(int i=len-1;i>=0;i--) {
			revv=revv+s.charAt(i);
		}System.out.println(revv);
	}
}
