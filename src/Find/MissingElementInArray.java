package Find;

public class MissingElementInArray{
	public static void main(String[] args) {
	
			
	int[] arr = {1,2,3,4,6,7,8,9};
	
	int sum1=0;
	int sum2=0;
	for (int i = 0; i < arr.length; i++) {
		sum1=sum1+arr[i];
	}System.out.println(sum1);
	
	for (int i = 1; i <= 9; i++) {
		sum2=sum2+i;
	}System.out.println(sum2);
	
	System.out.println("missing element is "+(sum2-sum1));
	
	}
}