package OOPS;

public class Encapsulation1 {

	/*
	 * The process of grouping data members and correspondent methods inside class
	 */	
	private int roll;
	private String name;
	private boolean isAttended;
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean getIsAttended() {
		System.out.println("teacher accessed attendence");
		return isAttended;
	}
	public void setAttended(boolean isAttended) {
		this.isAttended = isAttended;
		System.out.println("teacher assigned attendence");
	}

	
	
	
	
	
	
	
	
	
	/*
	 * public Student(int roll ) { this.roll=roll; }
	 * 
	 * public void setIsAttended(boolean flag) { if(!isAttended) this.isAttended =
	 * flag; System.out.println("teacher assigned student attendence"); } public
	 * boolean getIsAttended() {
	 * System.out.println("teacher accessed student attendence"); return isAttended;
	 * }
	 */


	

}