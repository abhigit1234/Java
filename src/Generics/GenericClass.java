package Generics;
/*
class test{
	int id;
	String name;
	public test(int empid,String userName ) {
		this.id=empid;
		this.name=userName;
	}
	public void execute() {
		System.out.println(this.id);
		System.out.println(this.name);
	}
}



public class GenericClass {

	public static void main(String[] args) throws Exception {
		
	test t = new test(10, "abhi");
	t.execute();
	
	}

}
*/
class test<T,U>{
	T id;
	U name;
	public test(T empid,U userName ) {
		this.id=empid;
		this.name=userName;
	}
	public void execute() {
		System.out.println(this.id);
		System.out.println(this.name);
	}
}



public class GenericClass {

	public static void main(String[] args) throws Exception {
		
	test<String,Integer> t = new test<String,Integer>("babu",100);
	t.execute();
	}

}