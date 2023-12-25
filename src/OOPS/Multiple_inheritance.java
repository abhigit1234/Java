package OOPS;


 class X {
	public void test1() {
		System.out.println("test1");
	}
}
 class Y extends X{
	public void test2() {
		System.out.println("test2");
	}
	
	
}
class Z extends X{
	public void test3() {
		System.out.println("test3");
	}
}
public class Multiple_inheritance {	
	public static void main(String[] args) {
		Y y = new Y();
		y.test1();
		y.test2();
		
		System.out.println();
		
		Z z = new Z();
			z.test1();
			z.test3();
	}
}
