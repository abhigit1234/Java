package Find;

public class Min_Max {
	public static void main(String[] args) throws Exception {
		
		
	int[] arr = {12,333,4,453,223,1214};	
		int min=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}System.out.println("min num is "+min);
	
	
		int[] ar = {12,333,4,453,223,1214};	
		int max=ar[0];
		for (int i = 1; i < ar.length; i++) {
			if(ar[i]>max) {
				max=ar[i];
			}
		}System.out.println("max num is "+max);
	
	
	}

}