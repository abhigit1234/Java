package class_methods;

public class Student_Constructor {

	// method 1 by calling reference variable
	
	int stid;
	String stname;
	char stgrade;

 	
	
	//method 2 by calling method
	
	void getvalues(int id, String name, char grade) {
		stid = id;
		stname = name;
		stgrade = grade;
	}
	
	
	// method 3 by calling Constructors(should be same as classname)

	Student_Constructor(int id,String name,char grade){
		stid = id;
		stname = name;
		stgrade = grade;
	
		
	}
	
	
	void display() {
//		System.out.println(stid);
//		System.out.println(stname);
//		System.out.println(stgrade);
		System.out.println(stid+" "+stname+" "+stgrade);
	}
	
 

	
	
	
	
	
	
	
}
