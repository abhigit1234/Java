package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapp {
//Creation of map
//Addition of elements
//Retireval of keys 
//Retireval of values
//Verification of keys
//Verification of values
//Updation of elements
//Deletion of elements

	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<Integer, String>();

		// Adding elements

		m.put(500047, "Malkajgiri");
		m.put(500089, "Koti");
		m.put(500034, "Miyapur");
		m.put(500025, "HitechCity");

//1) Retrieval of keys from elements

		/*
		 * Set<Integer> key = m.keySet();
		 * 
		 * for (Integer keys : key) { System.out.println(keys); }
		 */

//2) Retrieval of values from elements

		/*
		 * Collection<String> value = m.values();
		 * 
		 * for (String values : value) { System.out.println(values); }
		 */

//3) Retrieval of values based on a key	
		/* System.out.println(m.get(500034)); */

//4) Retireval of key and values
		/*
		 * Set<Integer> key = m.keySet(); for (Integer keys : key) {
		 * System.out.println(keys+">>>>"+m.get(keys)); }
		 */
//5) Deletion of keys
		/*
		 * System.out.println(m); m.remove(500034); m.remove(500034, "Miyapur");
		 * System.out.println(m);
		 */

//6) Verify key & value	
		/*
		 * System.out.println(m.containsKey(500047));
		 * System.out.println(m.containsValue("HitechCity"));
		 */

//7) Updation
		/*
		 * System.out.println(m); m.replace(500047, "warangal");
		 * 
		 * //or m.put(500034, "Kachiguda");
		 */

		// we have another option for put if value is not present
		/*
		 * m.putIfAbsent(522130, "Anandbagh"); System.out.println(m);
		 */
//8) extra methods
		/*
		 * System.out.println(m.size()); m.clear(); System.out.println(m);
		 */
	
	
//9) Entry	
	
		java.util.Set<Entry<Integer,String>> entry = m.entrySet();
		for (Entry<Integer, String> e : entry) {
			Integer key = e.getKey();
			String val = e.getValue();
			System.out.println(key+" "+val);
		}
		
	
	
	}

}
