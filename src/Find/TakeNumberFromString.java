package Find;

public class TakeNumberFromString {

	public static void main(String[] args) {
		
		String input = "page not found 400";
		System.out.println("num is :" +input.replaceAll("[^0-9]",""));
		
		String x = "hello my mob no is  9985400503 and pin is 500047";
		System.out.println("Text is : "+x.replaceAll("[^a-z]"," "));
	}
}
