package com.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class Vectr implements Comparable {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("aaa");
		al.add("bbb");
		
		// default capacity 10
		Vector<String> v = new Vector<String>(al);
		System.out.println(v.capacity());
		v.add("saqib");
		v.add("ansari");
		System.out.println(v.size());
		v.add("arfa");
		v.add("saqib");
		v.add("ansari");
		v.add("arfa");
		v.add("saqib");
		v.add("ansari");
		v.add("arfa");
		v.add("saqib");
		v.add("ansari");
		v.add("arfa");
		System.out.println(v.capacity());
		System.out.println(v);
		
		Collections.sort(v);

	}

//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		String s = (Object)o;
//		if(o ==s)
//		return 0;
//	}

}
