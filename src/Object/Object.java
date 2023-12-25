package Object;


public class Object {

	
	// inside class we can have n number of objects
	
	public Object() {
		
	}
	public Object(int a) {
		
	}
	
	
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object(11);	
		Object o3 = new Object(21);
		Object o4 = new Object(31);	
		System.out.println(o1.hashCode()+" "+o2.hashCode());
		
	}
	
	
	
	
}
