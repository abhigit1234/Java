package Methods;

public class globalVariables {

	int id;
	String name;
	
	
	void test1() {
		System.out.println(id+"   "+name);
	}
	
	void test2(int stId,String stName) {
		id=stId;
		name=stName;
		System.out.println(id+" "+name);
				
	}
	
	void test3(int id,String name) {
		this.id=id;
		this.name=name;
		System.out.println(id+" "+name);
	}
	
	public globalVariables(int gId,String gName) {
		id=gId;
		name=gName;
		
	}
	
	
	
	
	public static void main(String[] args) {
	globalVariables gb = new globalVariables(400,"hash");
	
	gb.test1();
	
	System.out.println(gb.id=100);
	System.out.println(gb.name="abhi");
	gb.test2(200, "babu");
	gb.test3(300, "naidu");
	
	
	}
	
}
