package ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// in main method if we mention "throws Throwable" or "throws Exception"
		// we no need to throw add declaration message

		/*
		 * int a = 10; int b = 0; int sum = 0; System.out.println("execution started");
		 * try { sum = a / b; System.out.println(sum); } catch (ArithmeticException e) {
		 * System.out.println(e.toString());
		 * 
		 * } File f = new File("");
		 * 
		 * FileInputStream fis = new FileInputStream(f);
		 * 
		 * System.out.println("end of execution"); }
		 */

// if we mention "throw" it will not allow next line to execute		
// if we mention "return" for method it will not allow next line		

		int a = 10;
		int b = 0;
		int result = 0;
		System.out.println("execution started");
		try {
			result = a / b;
		} catch (ArithmeticException e) {
			System.out.println(e);
			throw e;
		} finally {
			System.out.println("finally block");
		}
		System.out.println("execution ended");
	}

}
