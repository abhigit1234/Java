package Find;

public class SumOfElementsInArray{

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5}; 
		int sum=0;
		int len = arr.length;
		for(int i=0;i<=len-1;i++) {
			sum = sum+arr[i];
		}
		System.out.println(sum);
	
		int[] ar = {1,2,3,4,5};
		int count=0;
		for (int val : ar) {
			count = count+val;
		}
		System.out.println(count);
	
	}
	
}
