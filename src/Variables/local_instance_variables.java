package Variables;
public class local_instance_variables {

	//instance variables
	// default values are only provided for instance variables
	int a;
	float f;
	double d;
	String s;
	char c;
	
	void test() {
	//local variables
	// no default values are provided for local variables	
		int a;
		float f;
		double d;
		String s;
		
			System.out.println();
	}
	
	
	public static void main(String[] args) {
		
	local_instance_variables l =new local_instance_variables();
	l.test();
	System.out.println(l.c);
	
	
	}

}