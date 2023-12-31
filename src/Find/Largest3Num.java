package Find;

import java.util.Scanner;

public class Largest3Num{

	public static void main(String[] args) throws Exception {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first num");
		int a = sc.nextInt();
		
		System.out.println("enter second num");
		int b = sc.nextInt();
		
		System.out.println("enter third num");
		int c = sc.nextInt();
		
		if(a>b&&a>c) {
			System.out.println(a+ " a is largest num");
		}else if(b>a&&b>c) {
			System.out.println(b+ " b is largest num");
		}else {
			System.out.println(c+ " c is largest num");
		}
		System.out.println();
	
		
		int x=60;
		int y=20;
		
		if(x>y) {
			System.out.println(x+ " x is largest num");
		}else if(y>x) {
			System.out.println(y+ " y is largest num");
		}
	
	
	
	}
}