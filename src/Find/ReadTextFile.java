package Find;

import java.io.File;
import java.util.Scanner;

public class ReadTextFile{

	public static void main(String[] args) throws Exception {
		
		//Method 1
		/*
		 * Scanner sc = new Scanner(new
		 * File("C:\\Users\\tubby\\Desktop\\ReadTextJava.txt")); while(sc.hasNext()) {
		 * System.out.println(sc.nextLine()); }
		 */
		
		//Method 2
		Scanner sc = new Scanner(new File("C:\\Users\\tubby\\Desktop\\ReadTextJava.txt"));
		
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());
		
	}
}