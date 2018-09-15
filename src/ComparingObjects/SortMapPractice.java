package ComparingObjects;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortMapPractice {
	public static void main(String[] args) {
		
		//SortMap<Integer,String>  cityMap=new ThreeMao<>();
		//Map<Integer,String> cityMap= new HashMap<>();
//		cityMap.put(22010, "atlanta");
//		cityMap.put(22193, "chicaco");
//		cityMap.put(11921, "new York");
//		cityMap.put(98781, "DC");
//		Set<Map.Entry<Integer, String>> entrySet=cityMap.entrySet();
//		Iterator<Entry<Integer, String>> it=entrySet.iterator();
//		while(it.hasNext()) {
//			Map.Entry<Integer,String> me=it.next();
//		System.out.print(me.getKey()+"  ");
//			System.out.println(me.getValue());
//		}
		//Comparator<Integer> com= new Compreat();
		SortedMap<Integer,String> cityMap= new TreeMap<>();
		cityMap.put(22010, "d1");
		cityMap.put(22193, "d2");
		cityMap.put(11921, "d3");
		cityMap.put(98781, "d4");
		cityMap.put(11921, "d5");
		System.out.println(cityMap);
		
		
		
	}
}

class Compreat implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
	//	return Integer.compare(o1, o2);
		return o1-o2;
	}

	
	
	
}

