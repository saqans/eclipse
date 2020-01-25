package com.array;

import java.util.ArrayList;
import java.util.Vector;

public class Vectr {

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

	}

}
