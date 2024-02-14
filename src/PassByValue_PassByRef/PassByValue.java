package PassByValue_PassByRef;

class value{
	
	int data = 10;
	
	public void update(int a) {
		data=data+a;
	
	}
}



public class PassByValue {
	public static void main(String[] args) {
		value v = new value();
		System.out.println("before change "+v.data);
		v.update(20);
		System.out.println("after change "+v.data);
		
		
	}
}