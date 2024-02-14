package Super_This;


// By default java will write no argument default constructor
// And it checks with super() constructor if super class is having no argument constructor or not
// If parent class and child class have no argument constructor then it executes program 
// If Parent class has argument constructor and child class has no argument constructor while extends it throws error

/////////////////////////////////////////////   NO Error
class test1{
	
}
class test2 extends test1{
	
}
//////////////////////////////////////////////// No Error
class test3 {
	public test3() {
		
	}
}
class test4 extends test3{
	
}
////////////////////////////////////////////////// Error is there

class test5{
	public test5(int i) {
		
	}
}

class test6 extends test5{
	
public test6(int i) {
	super(1021);
	System.out.println(i);
}
	

	//By default java will create default no argument constructor and checks with parent class whether it has arguments or not
	
}


public class parent_child_callsBy_super{
	public static void main(String[] args) {
		
		
	}

	}