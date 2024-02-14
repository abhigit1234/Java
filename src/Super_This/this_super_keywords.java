package Super_This;

//=====this and super are for variables inside class ========
//=====we cannot use this and super keyword for static methods
class Parent{
	
	String s = "Parent";
}

public class this_super_keywords extends Parent{
	
	 String s = "Child";
	
	 void m1() {
		System.out.println(s);
		System.out.println(super.s);
		System.out.println(this.s);
	}
	
	public static void main(String[] args) {
		this_super_keywords t = new this_super_keywords();
		t.m1();
	}
}