package PassByValue_PassByRef;

class ref{
	
	int data = 10;
	
	public void update(ref a) {
		a.data=a.data+20;
	
	}
}



public class PassByRef {
	public static void main(String[] args) {
		ref r = new ref();
		
		System.out.println("before change "+r.data);
		r.update(r);
		System.out.println("after change "+r.data);
		
		
	}
}