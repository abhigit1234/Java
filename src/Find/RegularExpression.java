package Find;

import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {

		// Method 1
		boolean s = Pattern.matches(".*my.*", "My name Is abhi ".toLowerCase());
		if (s) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		/*
		 * //Method 2 boolean b =
		 * Pattern.compile(".*e.*").matcher("hello mr abhi babu naidu").matches(); if
		 * (b) { System.out.println("T"); } else { System.out.println("F"); }
		 */
	}
}
