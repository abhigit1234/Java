package Find;

public class LargestWord2 {
	public static void main(String[] args) throws Exception{
		
	String s = "hello mr durgumahanthi";
	System.out.println(findLargestWord(s));
		
	}
	
	public static String findLargestWord(String word) {
		String[] s = word.split(" ");
		String temp="";
		for (int i = 0; i < s.length; i++) {
			if(s[i].length()>temp.length()) {
				temp=s[i];
			}
		}return temp;
	}
}