package javaobjpra;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> hMap = new HashMap<Integer, String>();

		hMap.put(101, "Sazid Ahmed Nassir");
		hMap.put(102, "MD Rizwanur Rahman");
		hMap.put(103, "Sazid Ahmed Nassir");

		System.out.println(hMap);
		System.out.println("Size of HashMap " + hMap.size());
		hMap.remove(103);
		hMap.put(103, "Tanjeem Alam");
		System.out.println(hMap);
		System.out.println(hMap.get(103));
		System.out.println(hMap.keySet());
		System.out.println(hMap.values());
		System.out.println(hMap.entrySet());

		for (int k : hMap.keySet()) {
			System.out.println(k + " " + hMap.get(k));
		}

		Iterator<Entry<Integer, String>> it = hMap.entrySet().iterator();

		while (it.hasNext()) {
			Entry<Integer, String> entry = it.next();
			System.out.println("Iterator " + entry.getKey() + " " + entry.getValue());

		}

		hMap.clear();
		System.out.println(hMap);
	}

}
