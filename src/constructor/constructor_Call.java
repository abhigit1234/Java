package constructor;


class A{
	public A(String name) {
		this(11);
		System.out.println("String argument constructor");
	}
	public A(int a) {
		this();
		System.out.println(" int argument arguments");
	}
	public A() {
		System.out.println("no argument");
	}
	
}
class B extends A{
	public B() {
		//super();
		System.out.println("B constructor");
	}
}


public class constructor_Call {
	public static void main(String[] args) {
		A a = new A();
		
	}
}