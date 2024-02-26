<<<<<<< HEAD
package Find;

public class LargestWord1 {
	public static void main(String[] args) throws Exception{
		
	String s = "hello  my name is abhilash babu";
	String[] text =s.split(" ");
	String temp="";
	
	for (int i = 0; i < text.length; i++) {
		if(text[i].length()>temp.length()) {
			temp=text[i];
		}
		
	}System.out.println(temp);
	
	
	}
}
=======
package Find;

public class LargestWord1 {
	public static void main(String[] args) throws Exception{
		
	String s = "hello  my name is abhilash babu";
	String[] text =s.split(" ");
	String temp="";
	
	for (int i = 0; i < text.length; i++) {
		if(text[i].length()>temp.length()) {
			temp=text[i];
		}
		
	}System.out.println(temp);
	
	
	}
}
>>>>>>> 42f71c7ea9b5d975f473641acdf2a7246ad5343b
