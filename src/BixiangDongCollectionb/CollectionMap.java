package BixiangDongCollectionb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionMap {
	public static void main(String[] args) {
		List<String> key = new ArrayList<>();
		key.add("abs");
		key.add("abs1");
		key.add("abs2");
		key.add("abs3");
		key.add("abs4");

		List<String> value = new ArrayList<>();
		value.add("1");
		value.add("2");
		value.add("3");
		value.add("4");
		value.add("5");

		Iterator<String> it = key.iterator();
		Iterator<String> it2 = value.iterator();
		Map<String, String> map = new HashMap<>();
		while (it.hasNext()) {
			map.put(it.next(), it2.next());
		}

		System.out.println(map);

		Set<Entry<String, String>> entry = map.entrySet();
		Iterator<Entry<String, String>> loop = entry.iterator();
		while(loop.hasNext()) {
			Map.Entry<String, String> me =loop.next();
			if(me.getValue().equals("1")) {
				System.out.println(me.getKey());
			}
			
		}
	}

}
