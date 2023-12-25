package class_methods;

interface A{
	int a=10; // by default variables are static and final
	int b=20;
	
	void m1(); // abstract method, by default public


}

public class Interface implements A{

public	void m1() {
		System.out.println(a);
		System.out.println(b);
	}

public static void main(String[] args) {
/*	Interface it = new Interface(); 
	it.m1();
*/

	A a = new Interface();
	a.m1();


}
}
