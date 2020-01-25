package com.array;

import java.util.ArrayList;
import java.util.Iterator;
import com.array.Book;

public class IteratorRemoveString {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("saqib");
		al.add("arfa");
		al.add("mahnoor");
		al.add("hassan");

		Iterator<String> itr = al.iterator();

		while (itr.hasNext()) {

			String s = itr.next();
			if (s.equals("saqib"))
				itr.remove();
			System.out.println(al);

		}

		ArrayList<Book> books = new ArrayList<Book>();
		books.add(new Book(111, "java", "james"));
		books.add(new Book(222, "python", "gosling"));
		books.add(new Book(333, "c", "herbert"));

		Iterator<Book> itr1 = books.iterator();
		while (itr1.hasNext()) {
			Book b = itr1.next();
			if (b.id == 111)
				itr1.remove();
			if (b.name.equals("python"))
				itr1.remove();

		}

		for (Book bk : books) {
			System.out.println(bk.id + " " + bk.name + " " + bk.author);
		}

	}

}
