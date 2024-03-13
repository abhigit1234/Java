package AbstractClass;
 /*  Abstraction : It is a class who's object cannot be created. Any thing normal
  java class have, an abstract class can also have. Inside a class even a
  single method or abstract method is present then a class must define
  abstract.
  
  Final : Variable can be final, Method can be final, Class can be final
  
  If method is final - It cannot be override
  
  If class is final - It cannot be implemented
  
  
  */
  
final class test1 {
final	void fun() {
	System.out.println("inside parent class method");
}
}
//class test2 extends test1{
	
//}

public class AbstractClass_FinalKeyword {
	public static void main(String[] args) {
	
//	test2 t = new test2();
//	t.fun();
	
	
	}
	
}
