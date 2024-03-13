package Find;
			
public class ReverseWords {
	public static void main(String[] args) throws Exception{	
		
		// method 1 with " " gaps in double quotation
		
		String s = "hello i am abhilash";
		String[] s1=s.split(" ");
		StringBuffer sb = new StringBuffer();
		for (int i = s1.length-1; i >=0;i--) {
			sb.append(s1[i]).append(" ");
		} System.out.println(sb);
		
		
		// method 2 with "" without gaps in double quotation
		
		String st = "hello i am abhilash";
		String[] s2=st.split("");
		StringBuffer stb = new StringBuffer();
		for (int i = s2.length-1; i >=0;i--) {
			stb.append(s2[i]).append("");
		} System.out.println(stb);
		
	}	
}



