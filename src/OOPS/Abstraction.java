package OOPS;

interface Vehicle{
	void car();
	void bike();
}
abstract class Audi implements Vehicle  {
	
	public void car() {
	System.out.println("Audi - Q");	
	}
	public abstract void bike();
	
}
class BMW extends Audi{
	public void bike() {
		
	System.out.println("BMW - S");	
	}
}


public class Abstraction{
	public static void main(String[] args) {
		
		BMW bmw = new BMW();
		bmw.car();
		bmw.bike();
	}
}
