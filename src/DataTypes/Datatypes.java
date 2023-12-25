package DataTypes;
/*
datatypes : primitive datatype 
1) number : a)integer type, b) decimal type
			integer type - Byte,Short,Integer,Long
			decimal type - Float , Double				   
					   
							   
							   -2) boolean
							   -3) char 		
		:	non primitive datatype -class - arrays - collections
			
			

*/
public class Datatypes {

	//inside class we have 2members :variables and methods
	
	
	public String Breed  = "rottweiler";
	public int height  = 4;
	public int weight = 39; 
	
	public static void main(String[] args) {	//method
		Datatypes d = new Datatypes();
		System.out.println(d.Breed);
		
	}
}
