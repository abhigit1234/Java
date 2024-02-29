package Find;

public class ReverseWord {

	public static void main(String[] args) {
		
		String s = "hello abhilash how are you";
		String[] s1=s.split(" ");
		int temp=0;
		StringBuffer sb = new StringBuffer();
		for (int i = s1.length-1; i>=0;i--) {
			sb.append(s1[i]).append(" ");
			
		}System.out.println(sb);
	
	
	}

}
