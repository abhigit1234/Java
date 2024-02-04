package Find;

public class PrimeNumber {
	public static void main(String[] args) {
		int num =41;
		int count=0;
		for (int i = 1; i <= num; i++) {
			if(num%i==0) {
				count++;
			}
		}if(count==2) {
			System.out.println("P");
		}else {
			System.out.println("N");
		}
	
	
	
	
	
	}
}