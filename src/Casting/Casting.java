package Casting;



class A{
	void show1() {
		System.out.println("in A show");
	}
}
class B extends A{
	void show2() {
		System.out.println("in B show");
	}
}
public class Casting {

	public static void main(String[] args) {

//Type casting
		
	double d = 12.8;
	int i = (int)d;
	System.out.println(i);
	System.out.println();
	/* A a = new A(); */

	// ==     UpCasting  ==
	//Obj of B reffered to A(parentclass)
	// subclass B assigned to parentclass A
	// No need to mention (A)new B(); because internally it uses.
	A obj1 = (A)new B(); // or A obj = new B(); 
	obj1.show1();
	
	System.out.println();
	
	// ==     DownCasting  ==	
	
	B obj2 =(B)obj1;	
	obj2.show1();
	obj2.show2();
	}
	
}
