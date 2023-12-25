package Files;

import java.io.File;
import java.util.Arrays;

public class FileInJava {

	public static void main(String[] args) throws Exception {

		File f = new File("C:\\Users\\tubby\\eclipse-workspace\\ABHI_SELENIUM_PRACTICE");
//	System.out.println(	Arrays.toString(f.list()));
//		System.out.println(	Arrays.toString(f.listFiles()));	
	
		
		/*
		 * f.delete(); f.createNewFile();
		 */

		/*
		 * if(f.exists()) f.delete(); f.createNewFile(); System.out.println(f.exists());
		 * System.out.println(f.delete());
		 */

//		System.out.println(f.isHidden());
	
		/*
		 * System.out.println(f.canWrite()); System.out.println(f.setWritable(true));//
		 * set false for Readonly System.out.println(f.canWrite()); // set true for
		 * write
		 */	
	
		System.out.println(f.createNewFile());	
	
	
	
	
	
	
	
	
	
	
	
	}
}
