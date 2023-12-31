package Find;

import java.util.Scanner;

public class Factorial{

	public static void main(String[] args) throws Exception {
		
		int num = 7;
		long factorial = 1;
		
		for(int i=1;i<=num;i++) {
			factorial=factorial*i;
		}System.out.println(factorial);
	
	
	}
}