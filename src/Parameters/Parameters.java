package Parameters;

public class Parameters {

	public static void test() {
		System.out.println("test");
	}

	public static void test(int a, int b, String name) {
	System.out.println(a+" "+b+" "+name);
	}

	public static void main(String[] args) {
		
		test();
		test(1, 2, "abhi");
	}
}
