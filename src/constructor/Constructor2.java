package constructor;

public class Constructor2 {

	public  void test() {
		System.out.println("test");
	}


	public Constructor2() {
		System.out.println("constructor");
	}
	public static void main(String[] args) {
	Constructor2 c= new Constructor2();
		c.test();
	}
	

}
