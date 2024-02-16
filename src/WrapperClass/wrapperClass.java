package WrapperClass;

import java.util.ArrayList;
import java.util.List;

/*wrapper class is a class which holds primitive data types
this was introduced because in collections framework we only use objects
like Integer/String..
To change primitive data type to object we need class that is wrapper class

	primitive || wrapperclass
	--------	-----------
	int 		-> Integer
	double		-> Double
	short		-> Short
	byte		-> Byte	(-128 to 127)
	long		-> Long
	char		-> Character
	boolean 	-> Boolean
	float		-> Float
	



*/

public class wrapperClass{
	public static void main(String[] args) {
	
		//Boxing
		Integer i1 = Integer.valueOf(10);  
		
		//Auto-Boxing
		Integer i2 = 20;
	
		//Un-Boxing
		Integer i3 = Integer.valueOf(30);
		int i4 = i3.intValue();
		
		
		//Auto-Un-Boxing
		Integer i5 = Integer.valueOf(30);
		int i6 = i5;

		
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(22); //Auto boxing
		l.add(33);
		l.add(Integer.valueOf(44)); //Boxing
		
		
		//converting 
		String s = "500";
		Integer i7 = Integer.valueOf(s);//instead of using int use wrapper class Integers
										//because valueof() will return Integer	
			
		int i8 = Integer.parseInt(s);//instead of using wrapper class Integer use int
									 //because parseInt() will return int	
		System.out.println(i8);
		
		
		
		
		
		
		
		
	}
}