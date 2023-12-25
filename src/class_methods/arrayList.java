package class_methods;

import java.util.ArrayList;

/*
	operations on array list:
	How to declare arraylist
	How to add element/values to array list
	Find size of array list
	Read values from array list
	Remove elements/values from array list
*/

public class arrayList {
	public static void main(String[] args) {

	//	ArrayList list = new ArrayList(); // can store any type of elements
	//	ArrayList<String> slist = new ArrayList<String>();
	//	ArrayList<Integer> ilist = new ArrayList<Integer>();
	
/*	ArrayList<String> slist = new ArrayList<String>();
	slist.add("abhi");
	slist.add("babu");
	slist.add("hyd");
	slist.add("ind");
	System.out.println(slist);
	System.out.println("before removing "+slist.size());
	System.out.println("element removed "+slist.remove(2));
	System.out.println(slist);
	slist.add(2, "chennai");
	System.out.println(slist);
	
	for(int i=0;i<slist.size();i++) {
		System.out.println(slist.get(i));
	}
	
	for(String a :slist) {
		System.out.println(a);
	}
*/

/*		ArrayList<Integer> ilist = new ArrayList<Integer>();
		ilist.add(1);
		ilist.add(2);
		ilist.add(3);
		ilist.add(4);
		System.out.println(ilist);
		for(int a : ilist) {
			System.out.println(a);
		}
*/		
	ArrayList list = new ArrayList();
	list.add("abhi");
	list.add(34);
	list.add(1989.00);
	
	System.out.println(list);
	
	for (Object obj : list) {
		System.out.println(obj);
	}
	
	
	
	}
}