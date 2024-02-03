package Find;

import java.util.Random;




public class RandomString_Integer {

	public static void main(String[] args) {

		// Random Int
		System.out.println(new Random().nextInt(100));

		// Random String
		
		String[] str = {"abhi","ravi","mahesh","sudheer","koushik"};
		System.out.println(str[new Random().nextInt(str.length)]);

		/*
		 * Random r = new Random(); System.out.println(r.nextInt(1000));
		 */
		
		/*
		 * RandomString ra = new RandomString(); System.out.println(ra.nextString() +
		 * "@gmail.com");
		 */
	
		String[] s = {"abhi","naidu","hyd","india","pakistan"};
		
		Random rs = new Random();
		System.out.println(s[rs.nextInt(s.length)]);
	
		
	
	} 
}
