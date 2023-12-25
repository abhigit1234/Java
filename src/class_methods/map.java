package class_methods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;



public class map {

	public static void main(String[] args) {

		Map<Integer, String> m = new LinkedHashMap<Integer, String>();
		m.put(1, "abhi");
		m.put(2, "hasanth");
		m.put(3, "ayansh");
		m.put(4, "harshini");
		
		System.out.println(m);

		Set<Integer> keys = m.keySet();
		for (Integer key : keys) {
			System.out.println(key);
		}
		Collection<String> c = m.values();
		for (String val : c) {
			System.out.println(val);
		}
		System.out.println();

		for (Integer key : keys) {
			System.out.println(key + "..." + m.get(key));
		}
		System.out.println();
		System.out.println(m.containsKey(3));
		System.out.println(m.containsValue("hasanth"));

		System.out.println();

		System.out.println(m);

		// System.out.println(m.remove(2));
		m.put(4, "sushma");
		m.replace(1, "london");
		System.out.println(m);

		System.out.println();

		System.out.println(m);

		m.putIfAbsent(4, "babu");
		System.out.println(m);

		System.out.println();
		System.out.println(m.size());
		
		
	 Set<Entry<Integer, String>> entry =  m.entrySet();
	 for (Entry<Integer, String> ent : entry) {
//		System.out.println(ent);
		Integer i = ent.getKey();
		String s =	ent.getValue();
		System.out.println(i+"  "+s);
	 
	 }
		
		
		
		
		
		
	}

}