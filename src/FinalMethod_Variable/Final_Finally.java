package FinalMethod_Variable;

public class Final_Finally{

	
	//Final is a keyword; used for variables and methods, cant change them
			final int x=10;

	// if method is final we cannot override that method in child class
			public final void test() {
				
			}
	// if class is final we cannot extend that class
			public final class Demo{

			}
	
			
	//Finally is used in trycatch block if try throws an error even though
			//finally will execute.
	
			public static void main(String[] args) {
				try {
					System.out.println(1/0);
				}finally { 
					System.out.println("hi");
					
				}System.out.println("outside finally");
			}
	
	}
