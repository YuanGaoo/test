package colloction;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTest {
	public static void main(String[] args) {
		/*
		 * HashMap VS HashTable
		 * 	hashmap can have 1 null key and many null value 
		 * 	hashTable can not have any null key and null value
		 * 	hashmap is not synchronized / HashTable is 
		 * */
		Map<String ,String> map= new HashMap<>();
		map.put(null, null);
		map.put("2", "yuan1");
		map.put("3", "yuan2");
		map.put("4", "yuan3");
		map.put("5", "yuan4");
		
		//Set<Entry<String, String>> set = map.entrySet();
		//Iterator<Entry<String, String>> it = set.iterator();
		for (Entry<String, String> entry : map.entrySet()) {
			System.out.print("key--->"+entry.getKey());
		System.out.println(", value-->"+entry.getValue());
		
		}
//		while(it.hasNext()) {
//			Map.Entry<String, String> me=it.next();
//			System.out.print("key--->"+me.getKey());
//			System.out.println(", value-->"+me.getValue());
//			
//		}
		
	}

}
