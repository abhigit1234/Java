package Find;

import java.util.Arrays;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {

//=======	Asscending Order	 method 1 ===============

		int[] x = {2,3,1,4,6,7};
		Arrays.parallelSort(x);
		System.out.println(Arrays.toString(x));

//=======	Asscending Order	 method 2 ===============	

		int[] y = {8,3,6,4,9,1};
		Arrays.sort(y);
		System.out.println(Arrays.toString(y));
		
//======   Descending Order ==============================

		Integer[] z = {75,45,26,909}; 
		Arrays.sort(z,Collections.reverseOrder());
		System.out.println(Arrays.toString(z));
	
	
//=====    Sorting using forloop	====================
	int[] arr = {2,3,51,45,6,21};
	
	int temp=0;
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if(arr[i]<arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);		
	}

	
	}
}
