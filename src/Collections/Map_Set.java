package Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Map_Set {
	public static void main(String[] args) {
		System.out.println("====hashmap===");
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		m.put("c", null);
		m.put("b", null);
		m.put("a", null);
		m.put("d", null);
		m.put(null, 111);

		Set<Entry<String, Integer>> set = m.entrySet();
		for (Entry<String, Integer> e : set) {
			System.out.println(e);
		}
		
		System.out.println();
		System.out.println("====hashtable===");
		Hashtable<String, Integer> m3 = new Hashtable<String, Integer>();
		m3.put("c", 98);
		m3.put("b", 77);
		m3.put("a", 91);
		m3.put("q", 91);
		m3.put("aa", 00);

		Set<Entry<String, Integer>> set3 = m3.entrySet();
		for (Entry<String, Integer> e3 : set3) {
			System.out.println(e3);
		}

		System.out.println();
		System.out.println("====linkedhashmap===");
		LinkedHashMap<String, Integer> m1 = new LinkedHashMap<String, Integer>();
		m1.put("c", null);
		m1.put("b", null);
		m1.put("a", null);
		m1.put("abhi", null);
		m1.put(null, null);

		Set<Entry<String, Integer>> set1 = m1.entrySet();
		for (Entry<String, Integer> e1 : set1) {
			System.out.println(e1);
		}

		System.out.println();

		System.out.println("=====treemap===");

		TreeMap<String, Integer> m2 = new TreeMap<String, Integer>();
		m2.put("c", 12);
		m2.put("b", 11);
		m2.put("a", 11);
		m2.put("d", null);
		m2.put("e", null);

		Set<Entry<String, Integer>> set2 = m2.entrySet();
		for (Entry<String, Integer> e2 : set2) {
			System.out.println(e2);
		}

		System.out.println();

		System.out.println("hashset");

		Set<String> s1 = new HashSet<String>();
		s1.add("z");
		s1.add("x");
		s1.add(null);
		System.out.println(s1);

		System.out.println();
		System.out.println("linkedhashset");

		Set<String> s2 = new LinkedHashSet<String>();
		s2.add(null);
		s2.add("x");
		s2.add("e");
		System.out.println(s2);

		System.out.println();
		System.out.println("treeset");

		Set<String> s3 = new TreeSet<String>();
		s3.add("z");
		s3.add("x");
		s3.add("a");
		System.out.println(s3);

	}
}
