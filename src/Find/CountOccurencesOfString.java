package Find;

public class CountOccurencesOfString {
	public static void main(String[] args) {

		
		String s="hello mr abhilash babu";
		int totalCount = s.length();
		int totalCountAfterRemove  = s.replaceAll("a", "").length();
		int count = totalCount-totalCountAfterRemove;
		System.out.println(count);
	}
	
	
	
	
	
}