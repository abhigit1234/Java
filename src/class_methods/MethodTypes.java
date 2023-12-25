package class_methods;
/*
case 1: not taking parameters and not returning values
case 2: not taking parameters but returning values
case 3:  taking parameters but not returning values
case 4: method takes parameters and also returns values
void methods doesnt return
if u want to return remove void and place int or string according to method type
*/

public class MethodTypes {

	int x = 10;
	int y = 20;
//===========================================================================================
	 // case 1 
//	void sum() { System.out.println(x+y); }
//============================================================================================	 

	// case 2
	
//	int sum() {
//
//		return x+y;
//	}
//==================================================================================================
	// case 3
	
//	void sum(int a, int b) {
//		System.out.println(a+b);
//	}
//================================================================================================
	
	// case 4
	
//	int sum(int a, int b) {
//		return a+b;
//	}
//==================================================================================================	
		
	public static void main(String[] args) {
		MethodTypes mt = new MethodTypes();
		//mt.sum();            //case 1

/*		int res =	mt.sum(); // case 2
		System.out.println(res);

     or
     
	System.out.println(mt.sum()); 
*/	
	//	mt.sum(100, 20); // case 3
	
/*	int res =	mt.sum(20, 30);
	System.out.println(res);
	
	or
	
	System.out.println(mt.sum(20,30));
*/	
		
		
	}

}
