package Find;

public class DuplicateArrays {

	
	public static void main(String[] args) {
		
	
		// arrays duplicates
		String[] arr = {"abhi","babu","naidu","abhi"};/*{"a","b","c","a","e","d","s","d"};*/ 
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
					System.out.println("Duplicate in array is : "+arr[i]);
			}
		}
	
	
	
	int[] ar = {1,2,3,1,2,5,6,7,3,6,7};
	for(int i=0;i<ar.length;i++) {
		for(int j=i+1;j<ar.length;j++) {
			if(ar[i]==ar[j]) {
				System.out.println("duplicate integer val is :"+ar[j]);
			}
		}
		}
	
	}

}
