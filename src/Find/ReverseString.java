package Find;

public class ReverseString {

	public static void main(String[] args) {

		String s = "Automation";
		String rev = "";
		int len = s.length();
		char ch;
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);

//		String s = "Manual";
//		String rev = "";
//		char[] arr = s.toCharArray();
//
//		int len = s.length();
//
//		for (int i = len - 1; i >= 0; i--) {
//			rev = rev + arr[i];
//		}
//		System.out.println(rev);

		/*
		 * String s = "Integration"; StringBuffer sb = new StringBuffer(s);
		 * System.out.println(sb.reverse());
		 */

	}
}
