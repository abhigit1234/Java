package class_methods;

public class employee_seperate_class {// in same project we can create main method in seperate class

	public static void main(String[] args) {

		employee emp1 = new employee();
		
		emp1.empid = 12321;
		emp1.name = "abhilash";
		emp1.salary = 19.45754;
		emp1.dep = "Testing";
		emp1.job = "automation java";
		emp1.display();

		System.out.println();

		employee emp2 = new employee();

		emp2.empid = 199876;
		emp2.name = "david";
		emp2.salary = 9.279;
		emp2.dep = "automation";
		emp2.job = "manager";
		emp2.display();

	}
}
