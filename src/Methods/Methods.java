package Methods;

public class Methods {

	// to perform any action inside class we create methods
	//accessmodifier-static or non static-return type-methodname(parameters){
	//}  

	static int currentbalance = 1000;
	
	public static  void customer() {
		System.out.println("Welcome to SBI");
	}
	public void deposit(int amount) {
		currentbalance = currentbalance+amount;
	}
	public static void withdraw(int amount) {
		currentbalance = currentbalance-amount;
	}
	
	public int getCurrentBalance() {
		return currentbalance;
	}
	
	
	
	public static void main(String[] args) {
	Methods m = new Methods();
	customer();
	System.out.println("currentBalance is  "+m.getCurrentBalance());
	m.deposit(500);
	System.out.println("currentBalance is  "+m.getCurrentBalance());
	withdraw(200);
	System.out.println("currentBalance is  "+m.getCurrentBalance());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
