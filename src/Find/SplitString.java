package Find;


public class SplitString {
	public static void main(String[] args) {
		
		
		String s = "automation is my job";
		String[]  ss = s.split("\\s");
		for(String x : ss) {
			System.out.println(x.charAt(1));
		}
		
		
	}
}