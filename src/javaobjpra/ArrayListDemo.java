package javaobjpra;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList mylist = new ArrayList();

		mylist.add(100);
		mylist.add(20.0);
		mylist.add("Sazid");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);

		System.out.println(mylist.size());
		System.out.println("Printing the data of arraylist " + mylist);
		mylist.remove(5);
		System.out.println("After removing Printing the data of arraylist " + mylist);
		mylist.add(2, "java");
		System.out.println("After insertion of arraylist " + mylist);
		mylist.set(2, "python");
		System.out.println("After replacing of arraylist " + mylist);
		System.out.println("Get the value " + mylist.get(4));

		for (int i = 0; i < mylist.size(); i++) {
			System.out.println(mylist.get(i));
		}

		for (Object x : mylist) {

			System.out.println(x);
		}

		Iterator it = mylist.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println(mylist.isEmpty());

		ArrayList myList2 = new ArrayList();
		myList2.add(100);
		myList2.add("we");
		myList2.add('A');

		mylist.removeAll(myList2);
		System.out.println("Printing the data of arraylist " + mylist);

		myList2.clear();
		System.out.println(myList2.isEmpty());
	}
}
