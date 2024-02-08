package Methods;

public class MethodsByPavan {

	// No Return
	void m1() {
		System.out.println("m1");
	}

	// return
	String m2() {
		return "m2";
	}
	
	// Takes Parameters No return
	void m3(int id,String name) {
		System.out.println(id+" "+name);
	}
	
	// Takes Parameter and Returns value
	String m4(int id,String name) {
		return (id+" "+name);
	}
//============================================================================//	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		MethodsByPavan mb = new MethodsByPavan();
		mb.m1();
		System.out.println(mb.m2());
		mb.m3(10, "m3");
		System.out.println(mb.m4(20, "m4"));
	}

}
