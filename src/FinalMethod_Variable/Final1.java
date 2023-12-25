package FinalMethod_Variable;

public class Final1 {

	// if method is final we cannot override that method in child class
	public final void test1() {
		System.out.println("final");
	}
	public  void test() {
		System.out.println("normal");
	}
	
}
