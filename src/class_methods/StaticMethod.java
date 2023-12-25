package class_methods;

public class StaticMethod {

	static int x = 10; // static variable
	int y = 20;

	static void m1() { // static method

		System.out.println("this is static method"); // 1 method
		//and by creating obj of class can access non static methods
		StaticMethod sm1=new StaticMethod(); // 2 method
		System.out.println(sm1.y);
		
	}

	void m2() {     // non static method
		System.out.println("this is non static method");
	}

	void m3() { // non static methods can access  static and non static stuff directly
		System.out.println(x);
		System.out.println(y);
		m1();
		m2();
		
	}
	public static void main(String[] args) {
// 1 - static methods can access static variables and static methods directly
// 2 - if main method is in another class we need to use class name.method
		
//	System.out.println(x);   //	1
//		m1();
//		System.out.println(StaticMethod.x);  // 2
//		StaticMethod.m1();

		StaticMethod sm = new StaticMethod();
		sm.m3();
	}

}
