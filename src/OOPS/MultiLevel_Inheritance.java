package OOPS;

interface i{
	void test1();
	void test2();
	void test3();
}
abstract class A implements i{
	public void test1() {
		System.out.println("test1");
	}
	public abstract void test2();
	public abstract void test3();
	
}
abstract class B extends A{
	public void test2() {
		System.out.println("test2");
	}
	public abstract void test3();
	
}
class C extends B{
	public void test3() {
		System.out.println("test3");
	}
}
public class MultiLevel_Inheritance {	
	public static void main(String[] args) {
			C c = new C();
			c.test1();
			c.test2();
			c.test3();

	}
}
