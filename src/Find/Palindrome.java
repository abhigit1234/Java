package Find;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) throws Exception {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		int rev=0;
		int num = sc.nextInt();
		int x=num;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
			
		}
		if(x==rev) {
			System.out.println("It is a pallindrome");
		}else {
			System.out.println("It is not a palindrome");
		}
	
	}

}



