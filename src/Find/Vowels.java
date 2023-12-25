package Find;

import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {

		String s = "Hello Mr AbhilashBabu";
		s = s.toLowerCase();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				count++;
			}
		}
		System.out.println("Total vowels present are :" + count);

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Enter String");
		 * 
		 * String s = sc.nextLine().toLowerCase();
		 * 
		 * int count = 0;
		 * 
		 * char ch;
		 * 
		 * for (int i = 0; i < s.length(); i++) {
		 * 
		 * ch = s.charAt(i);
		 * 
		 * if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { count++;
		 * }
		 * 
		 * } System.out.println("vowels are : " + count);
		 */

	}

}
