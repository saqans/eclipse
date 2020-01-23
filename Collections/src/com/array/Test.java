package com.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Test {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();

		al.add("saqib");
		al.add("ansari");
		al.add("mohammad");
		al.add("hassan");
		
		ListIterator<String> itr2 = al.listIterator();
		while(itr2.hasNext()) {
			String ss = itr2.next();
			System.out.println(ss);
		}
		
	
		
		while(itr2.hasPrevious()){
			String ss = itr2.previous();
			System.out.println("\nbackward " +ss);
		}
		
	}

}
