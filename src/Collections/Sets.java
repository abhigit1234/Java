package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// set is a interface and part of collections framework
//allows unique element of data
// duplicate data not allowed
//Operations are :Creation of set
//				Addition of elements
//				Retrieval of elements
//				Verification of elements
//				Deletion of elements

// hash set internally stores data into hashmap
// internally all hashset values will ad as keys
public class Sets {
	public static void main(String[] args) {
// HashSet - LinkedHashSet - TreeSet		
		
		
		//Hash set will not maintain order
		/*
		 * Set<Integer> s = new HashSet<Integer>(); s.add(3); s.add(66); s.add(23);
		 * s.add(121); s.add(76);
		 */
		
		/*
		 * System.out.println(s); System.out.println(s.contains(76));
		 * System.out.println(s.remove(3)); System.out.println(s.size());
		 * System.out.println(s);
		 */		
		
		/*
		 * Set<Integer> s2 = new HashSet<Integer>(); s2.add(11); s2.add(22); s2.add(33);
		 * 
		 * System.out.println(s.addAll(s2)); System.out.println(s); for (Integer i : s)
		 * { System.out.println(i); }
		 */
	
		//Linked Hash set will maintain insertion order we give
		
		/*
		 * LinkedHashSet<String> s = new LinkedHashSet<String>(); s.add("a");
		 * s.add("d"); s.add("c"); s.add("b"); s.add("e"); System.out.println(s);
		 */
		
		// Tree set will maintain sorting order
		
		TreeSet<String> t = new TreeSet<String>();
		t.add("c");
		t.add("b");
		t.add("a");
		System.out.println(t);
	}
}
