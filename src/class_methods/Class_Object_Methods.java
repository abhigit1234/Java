package class_methods;
// access modifiers - public,default,protected ,private,

// class is a collection f varibles and methods,

//In class if we didnt mention access modifier it takes default 
// obj is instance of class
//class=animal
//object=cats,dogs,pigs,ele..we can have n num of objects in class
//every obj is having variables and methods
// 

public class Class_Object_Methods { // CLASS METHODS
// variables
	int empid;
	String name;
	double salary;
	String dep;
	String job;
// methods	
	void display() {
		System.out.println(empid);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(dep);
		System.out.println(job);
	}
	
public static void main(String[] args) { 
	
 
	
	Class_Object_Methods emp1 = new Class_Object_Methods();  //creating object
	emp1.empid=2321;
	emp1.name="abhilash";
	emp1.salary = 19.45754;
	emp1.dep = "Testing";
	emp1.job = "automation java";
	emp1.display();

	System.out.println();

	Class_Object_Methods emp2 = new Class_Object_Methods(); // can create n num of obj in class
	emp2.empid=99876;
	emp2.name="david";
	emp2.salary = 9.279;
	emp2.dep = "automation";
	emp2.job = "manager";
	emp2.display();






}
	















}

