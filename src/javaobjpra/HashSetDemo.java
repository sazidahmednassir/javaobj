package javaobjpra;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet mySet = new HashSet();
		mySet.add(100);
		mySet.add(500);
		mySet.add(400);
		mySet.add(100);
		mySet.add("welcome");
		mySet.add('A');
		mySet.add(10.6);
		mySet.add(null);

		System.out.println(mySet);

		mySet.remove(10.5);
		System.out.println("After remvoing " + mySet);

		ArrayList aList = new ArrayList(mySet);
		aList.set(6, "Nassir");
		System.out.println(aList);
		System.out.println(aList.get(0));

		for (Object y : mySet) {
			System.out.println(y);
		}

		Iterator<Object> it2 = mySet.iterator();

		while (it2.hasNext()) {
			System.err.println(it2.next());
		}

		mySet.clear();

		System.out.println("After clearing " + mySet);
	}

}
