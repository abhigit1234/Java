package Generics;

public class GenericMethods {

	public static void main(String[] args) throws Exception {
	
	int i=10;
	String s = "abhi";	
	float f = 12.211F;
	display(s,i,f);
	display(12, "a", 1.21);
	}
	
	// generic for diff one data type
	public static <T> void display(T i,T s,T f) {
		System.out.println(s+" "+i+" "+f);
	}

	// generic for diff data types
//	public static <T,U> void display(T s,U i) {
//		System.out.println(s+" "+i);
//	}

}