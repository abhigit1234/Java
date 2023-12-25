package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/*Major Operations performed are :

Creation of a list
Adding elements into list
Retrieval of elements from list
only by providing index we retrieve values
Deletion of elements from list
Verification of elements in list
Updation of elements in list 
*/
public class ListOrArrayList_Vector {

	public static void main(String[] args) {
		Vector<String> v1 = new Vector<String>();
		v1.add("abhi");
		v1.add("babu");
		v1.add("naidu");
		v1.add(0,"ayaansh");
		
		Vector<String> v2 = new Vector<String>();
		v2.add("hash");
		v2.add("hasanth");
		v2.add("sushma");
		
		/*
		 * method 1 for adding System.out.println(v1); for(int i=0;i<v2.size();i++) {
		 * v1.add(v2.get(i)); } System.out.println(v1);
		 */
		 		
		
		/* method for printing
		 * for(String x:v1) { System.out.println(x); }
		 * 
		 * for(int i=0;i<v1.size();i++) { System.out.println(v1.get(i)); }
		 */
		
		/*
		 * //method 2 for adding all v1.addAll(v2); System.out.println(v1);
		 */		
		
		//method 3 for adding by index
		
		/*
		 * v1.addAll(1, v2); System.out.println(v1);
		 */	
//		System.out.println(v1);
//		System.out.println(v2.contains("sushma"));
//		System.out.println(v1.elementAt(2));
//		System.out.println(v1.firstElement());
//		System.out.println(v1.get(3));
//		System.out.println(v1.remove(2));
//		System.out.println(v1.removeAll(v1));
//		System.out.println(v1.set(0, "hyd"));
//		System.out.println(v1.indexOf("naidu"));
	
	
		// add all these values in form of arrays and print
		/*
		 * java.lang.Object[] arr = v1.toArray();
		 * System.out.println(Arrays.toString(arr));
		 */	
		

// instead of vector(old version before introducing collections ) we use ArrayList
		
	//	ArrayList<String> arr = new ArrayList<String>();
		
	// same as vector
		
		Integer[] arr = new Integer[] {1,2,3};
		List<Integer> s = new ArrayList<Integer>(Arrays.asList(arr));
		System.out.println(s);
		
		String[] ar = new String[] {"a","b","c","d","e","f","g"};
		List<String> as = new ArrayList<String>(Arrays.asList(ar));
		System.out.println(as);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
