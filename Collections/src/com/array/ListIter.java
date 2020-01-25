package com.array;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIter {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("saqib");
		al.add("ansari");
		al.add("arfa");
		
		ListIterator<String> lstr = al.listIterator();
		while(lstr.hasNext()) {
			String s = lstr.next();
			if(s.equals("saqib")) lstr.remove();
			if(s.equals("arfa")) lstr.set("mahnoor");
		}
		System.out.println(al);
	}
	
	
	

}
