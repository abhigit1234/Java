package class_methods;

public class ArrayDimension {
	public static void main(String[] args) {
	
		
//		int a[] = new int[3];
//		a[0]=1;
//		a[1]=2;
//		a[2]=3;
//		for(int i=0;i<a.length;i++) {
//			System.out.println(i);
//		}

		int a[][] = {{1,2,3},{4,5,6}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println(a[i][j]);
//		for(int i[] : a) {
//			for(int j:i) {
//				System.out.println(j);
			}
		}
		
		
		
		
		
		
		
		
		
		
////////////////////////////////////////////single dimensional array
		
	// declare size of array	
//		int a[] = new int[5];
//		a[0] = 100;
//		a[1] = 200;
//		a[2] = 300;
//		a[3] = 400;
//		a[4] = 500;
		
	
	// unlimited values of array
		
//		int a[]= {100,200,300,400,500,600,700};
//		System.out.println(a.length);  // length of an array
	
	//	classic forloop
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
	//  adv forloop / enhanced forloop
		
//	for (int i : a) {
//		System.out.println(i);
//	}

		
////////////////////////////////////////// multidimensional / two dimensional array
		
		// method 1
		
	/*	int a[][]= new int[2][3];
			a[0][0] = 100;
			a[0][1] = 200;
			a[0][2] = 300;
			
			a[1][0] = 400;
			a[1][1] = 500;
			a[1][2] = 600;
*/		
	// method 2
		
//		int a[][] = {{100,200,300},{400,500,600}};
//		System.out.println("num of rows "+a.length);
//		System.out.println("num of col "+a[0].length);
		
	//	classic loop
		
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a[i].length;j++) {
//				
//				System.out.print(" "+a[i][j]);		
//			}
//		System.out.println();
//		}
		
		// adv loop/ enhanced loop
//		for(int i[] : a) {
//			for(int j : i) {
//				System.out.print(" " +j);
//			}
//			System.out.println();
//			}
			
//====================================string[][]=====================
String[][] arr = {{"a","b"},{"c","d"}}; 

for(int i=0; i<arr.length; i++) {
	
	for(int j=0; j< arr[i].length; j++) {

		System.out.println(arr[i][j]);
	}
}


		
			
}
}