package Super_This;

// Constructor Call we use super() and this()
//Case 1 - super() must always be first line in constructor only
//Case 2 - this() or super() must be only in first line but dont use both 
//Case 3 - super( and this() can only used in constructors 

//super() we are calling super class constructor
//this() we are calling current class constructor

class A {

	public A() {
		this(2);
	}

	A(int x) {

		System.out.println(x);
	}

}

class B {
	public B() {
		super();
		System.out.println("B");
	}
}

public class super_this_Constructor_call {

	public static void main(String[] args) {

		A b = new A();
	}
}