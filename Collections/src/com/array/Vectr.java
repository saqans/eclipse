package com.array;

import java.util.Vector;

public class Vectr {

	public static void main(String[] args) {
		// default capacity 10
		Vector<String> v = new Vector<String>(2, 14);
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
		
		
		

	}

}
