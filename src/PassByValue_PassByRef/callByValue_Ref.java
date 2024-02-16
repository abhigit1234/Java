package PassByValue_PassByRef;

class Car{
	String name;
	float mileage;
	int cost;
}


public class callByValue_Ref {

	// call by ref
	public static void main(String[] args) {
	
		Car a = new Car();
		a.name="Bmw";
		a.mileage=12.32f;
		a.cost=75;
		
		System.out.println(a.name);
		System.out.println(a.mileage);
		System.out.println(a.cost);
	
		System.out.println("=============");
	
		Car b = new Car();
		b=a;
		System.out.println(b.name);
		System.out.println(b.mileage);
		System.out.println(b.cost);

		
		System.out.println("================");
		
		b.name="Audi";
		b.mileage=60.433f;
		b.cost=90;
	
		
			
		System.out.println(b.name);
		System.out.println(b.mileage);
		System.out.println(b.cost);
		
		System.out.println("=================");
		
		System.out.println(a.name);
		System.out.println(a.mileage);
		System.out.println(a.cost);
	
	}
	
/*	// call by value
 * 
	public static void main(String[] args) {
		int a = 1000;
		System.out.println(a);
	int b;
	b=a;
	System.out.println(b);
	System.out.println(a); 
		
	
	System.out.println();
	System.out.println();
	}
*/	
	
	
	
	

}