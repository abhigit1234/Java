package Find;

import java.util.Scanner;

public class SumOfNumEnteredByUser {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first number");
	int num1;
	int num2;
	num1=sc.nextInt();
	System.out.println("Enter second number");
	num2=sc.nextInt();
	
	System.out.println(num1+num2 );
	}
}
