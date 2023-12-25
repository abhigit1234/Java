package constructor;
// to perform initialisation to an object we use constructor
public class constructor {
	int rollnum;
	String name;

	public constructor(int rollnum,String name) {
		this.rollnum=rollnum;
		this.name=name;
	}
	public static void main(String[] args) {
		constructor d1 = new constructor(101,"abhilash");
		System.out.println(d1.rollnum);
		System.out.println(d1.name);
		
		constructor d2 = new constructor(201,"naidu");
		System.out.println(d2.rollnum);
		System.out.println(d2.name);
		
	
	}

	
}

