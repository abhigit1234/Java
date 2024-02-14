package StringBuffer_Builder;


public class stringBuffer_stringBuilder {
	// String are Immutable - Address will not change but data will change
	// StringBuffer and String Builder are Mutable - Address changes
	
	//StringBuffer and StringBuilder are same
	
	//a)StringBuffer is used for multi-threaded envi
	//b)StringBuilder is used for single-threaded envi
	
	
	public static void main(String[] args) {
		
		// Address changes thats why its not equal for same data
		StringBuffer sb1 = new StringBuffer("abhi");
		StringBuffer sb2 = new StringBuffer("abhi");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		
		System.out.println("==================================");
		
		StringBuffer sb = new StringBuffer("abhi");
		
		System.out.println(sb.append("lash"));
		System.out.println(sb.insert(0, "durgumahanthi "));
		System.out.println(sb.reverse());
		System.out.println(sb.charAt(3));
	
		
		
		System.out.println("====================================");
	
		// Address not changes thats why its equal
		String s1="abhi";
		String s2="abhi";
		System.out.println(s1==s2);
		//but now after appending its not equal
		s1=s1+"babu";
		System.out.println(s1==s2);
		
	
	}
}