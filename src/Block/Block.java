package Block;

public class Block {
//	In java first block will execute 
	

	static {
		System.out.println("static block");
	}
	
	{
		System.out.println("non - static block");
	}
	public Block() {
		System.out.println("constructor block");
	}
	
	public static void main(String[] args) {
		System.out.println("main");
		Block b= new Block();
		
		
	}

}
