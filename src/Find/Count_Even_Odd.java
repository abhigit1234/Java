package Find;

public class Count_Even_Odd{

	public static void main(String[] args) throws Exception {
		
		
		int num = 87977665;
		int even=0;
		int odd=0;
		
		while(num>0) {
			int reminder=num%10;
			if(reminder%2==0) {
				even++;
			}else {
				odd++;
			}
			num=num/10;
		}
		System.out.println("even num : "+even);
		System.out.println("odd num : "+odd);
		
		
	}
}