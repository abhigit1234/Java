package Find;

import java.util.regex.Pattern;

public class CheckStringPresent {

	public static void main(String[] args) {

		String s = "Hello Mr Abhilash".toLowerCase();

		boolean b = Pattern.matches(".*mr.*", s);
		
		if (b) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}
