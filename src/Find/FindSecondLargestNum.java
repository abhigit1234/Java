package Find;

import java.util.Arrays;

public class FindSecondLargestNum {

	public static void main(String[] args) {

	int[] num= {11,23,321,13,34};
	int n = num.length;
	Arrays.sort(num);
	System.out.println(num[n-2]);
	
	
	
	}

}