package class_methods;

interface ABC{
	int x1=10;
	int y1=20;
	void m1();
}
interface XYZ{
	int x2=30;
	int y2=40;
	void m2(); 
}
public class Inheritance_Multiple implements ABC,XYZ {
	public void m1() {
		System.out.println(x1);
		System.out.println(y1);
	}
	public void m2() {
		System.out.println(x2);
		System.out.println(y2);
	}
	public static void main(String[] args) {
		
	
Inheritance_Multiple im = new Inheritance_Multiple();
	im.m1();
	im.m2();
	}
}
