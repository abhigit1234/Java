package OOPS;

public class Polymorphism1 {
// compile time polymorphism - method overloading
// run time polymorphism - method overriding	
// method overloading - we provide same method with diff parameters
// method overriding-	implementing with diferent method name specifies as overriding
 	
	
	public static void test1() {
		System.out.println("test");
	}

	public static void test2(int a, int b, int c) {
	System.out.println(a+" "+b+" "+c);
	}

	public void test2(int a,int b) {
		System.out.println(a+" "+b);
	}
	
	
	
	



}
