package OOPS;

public class Encapsulation2 {
	public static void main(String[] args) {
		
		/*
		 * we should not create obj for variables which comes from parentclass like this
		 * because we dont have complete grip, so instead we create method in
		 * parentclass get||set methods.
		 * 
		 * Student s = new Student(100); System.out.println(s.roll);
		 */	
		
		Encapsulation1 encap = new Encapsulation1();
		
	//	encap.isAttended=true;     after private
		encap.setAttended(true);
		
	}
	
}