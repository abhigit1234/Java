package Variables;

public class Variables {

/*	In java we store variables inside container and access them for java execution.
	There are two diff types of var 1)Global 2)Local
	Instance variables (non static fields) / creating instance above main method
	Class variables (static fields)
	Local variables
	Parameters
	define and initialise
	*/
// If we create inside class we can access entire methods inside class.(Global)
// If we create inside method we call local variables.(access only that method)	
// for local variables we dont provide static.
// Rules for naming variables - single word i or name small letters
						//    - double word firstName camelcase
						//    - multiple words state tele dir (stateTeleDirec)	
// non static
	int id = 700; //instance variables so it is non static and we have to create object/instance to access.           
	String name = "naidu";
	
// static
	static	int tel =600;
	
	public static void main(String[] args) {
	/*	int pin = 500047;
		
		int pin; 		//define
		pin = 500047;   // initialisation
		
		System.out.println(pin);
		*/
		// 1) non static
		Variables v = new Variables();
		System.out.println(v.id);
		
		
		// 2) for non static 
		 System.out.println(new Variables().id);
	
		// 3) static
		 System.out.println(tel);
	
	 int i=29;
	System.out.println(new Variables().id); // global
	System.out.println(i); // local
	login(10);
	}
	
	public static void login(int x) {// we cannot assign parameters variables
									 // for that we need to create method login(10);	
		System.out.println(x);
	}
	
}
