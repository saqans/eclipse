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

		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			String s = (String) itr.next();
			System.out.println(s);
		}
		
		Iterator<String> itr2 = al.iterator();
		while(itr2.hasNext()) {
			String ss = itr2.next();
			System.out.println(ss);
		}
		
		ListIterator<String> itr3 = al.listIterator();
		while(itr3.hasPrevious()){
			String sss = itr3.previous();
			System.out.println("\nbackward " +sss);
		}

	}

}
