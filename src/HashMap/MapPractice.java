package HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapPractice {
	public static void main(String[] args) {
//		Map<Integer,String> map= new HashMap<>();
//		map.put(1, "soccer");
//		map.put(2, "basketball");
//		map.put(3, "pingpong");
//		map.put(3, "end");
//		if(map.containsKey(3)) {
//			System.out.println("in");
//			map.put(3, "something else");
//		}
//		map.putIfAbsent(4, "watermelon");
//		System.out.println(map);
		
		Map<String,String> jobMap= new HashMap<>();
		jobMap.put("SDET", "Vienna");
	    jobMap.put("MannualTester", "Fairfax");    
	    jobMap.put("DBA", "Herndon");
	    jobMap.put("ScrumMaster", "Reston");
	    jobMap.put("ProductOwner", "Fairfax");
	    jobMap.put("ScrumMaster", "DC");
	    
		System.out.println("before is --->  "+jobMap);
		Set<String> keys=jobMap.keySet();
//		for (String key : keys) {
//			System.out.println("in loop------->>"+key);
//		}
		Iterator<String> ot = keys.iterator();
		while(ot.hasNext()) {
			System.out.print(ot.next()+"   ");
		}
		System.out.println();
		keys.remove("ProductOwner");
		System.out.println(jobMap);
		
		Collection<String> allValue= jobMap.values();
		Iterator<String> it2=allValue.iterator();
		while(it2.hasNext()) {
			System.out.print(it2.next()+"  ");
		}
		//System.out.println(mapBully( map));
	}
	public static Map<String,String> mapBully(Map<String,String> map){
		if(map.containsKey("a")) {
			map.put("b", map.get("a"));
			map.put("a", "");
		}
		return map;
	}
}
