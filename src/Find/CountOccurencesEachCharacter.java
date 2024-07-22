package Find;

import java.util.HashMap;

public class CountOccurencesEachCharacter {

		
	//========method 1========
	
/*		public static void getOccurenceString(String s) {
		char[] ch = s.toCharArray();
		HashMap<Character, Integer> m = new HashMap<Character, Integer>();
		for (char c : ch) {
			if(m.containsKey(c)) {
				m.put(c, m.get(c)+1);
			}else {
				m.put(c, 1);
			}
		}System.out.println(s+" "+m);
	}
	
	
	public static void main(String[] args) {
		getOccurenceString("hello mr abhilash");	
	}
	
	*/	
	
	//==========method 2=========
	
	public static void main(String[] args) {
		
	
	
	String s = "automation testing";
	char[] ch = s.toCharArray();
	HashMap<Character, Integer> m = new HashMap<Character, Integer>();
	for (char c : ch) {
		if(m.containsKey(c)) {
			m.put(c, m.get(c)+1);
		}else {
			m.put(c, 1);
		}
	}System.out.println(s+" "+m);
	}
}
