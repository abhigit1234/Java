package constructor;
/*
Constructors :1)Used to initialise  objects
			  2)Return types are not applicable
			  3)Constructor can have public,default,private,protected 	
			  4)We can have miltiple constructors with diff parameters
			   					that is called overloading constructor.
			  5)AccessModifier for constructor is same as class modifier
			  6)Default constructor contains one line i.e super()
			  7)Overriding and inheritance is not applicable for constructors
			  8)Abstract class can also have constructor
			  
			  	
super/this keyword can be used any where inside class unless method is static
super/this can be used for method and variable			  
			  */


//constructor overloading

class Parent{
	public Parent(String s) {
		this(10);
		System.out.println("string argument");
	}
public Parent(int a) {
		this();
		System.out.println("int argument");
	}
public Parent() {
	System.out.println("no argument");
}	
}


public class constructorOverloading{
	public static void main(String[] args) {
		Parent p =new Parent("hello");
	}
}


