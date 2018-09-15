package HashMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/*
 * Map: add double elements onece, Collecation : add one element onecs ;
 *  其实map 集合中储存 的就是键值对（key and value）
 *  
 *  常用方法
 *   1: add elements;
 *   	value put(key,value) : return 前一个和key 关联的值，if not , return null 
 *   2: delete element :
 *   	void clear(); clear map collection
 *   	value remove(key) : find key's value by key, and delete value;
 *   3:判断
 *   	boolean containsKey(key);
 *   	boolean containsValye(value);
 *   	boolean isEmpty();
 *   
 *   4: get
 *   	value get(key); get value by key ;通过key 获取value ，if doesn't have this key , return null
 *   									and you can use return null , consider is contain the key 
 *   	int size(); return key's value size;
 *   	
 *   	
 * 		
 */

public class BixiangDongClass {
	public static void main(String[] args) {
		Map<Integer,String> map= new HashMap<Integer,String>();
		//method2(map);
		method_3(map);
		
		
	}
	public static void method_3(Map<Integer,String> map) {
		map.put(8, "wang wu");
		map.put(2, "zhao liu");
		map.put(7, "xiao qiang");
		map.put(6, "wang wu");
		Collection <String> values= map.values();
		Iterator<String> it1= values.iterator();
		
		while(it1.hasNext()) {
			System.out.println(it1.next());
			
		}
		
		/* 通过map 转成set 就可以iterator
		 * 找到了另个一个方法。 entryset
		 * 该方法讲key 和value 的映射关系作为object 储存到了set collection 中， 二这个映射关系的类型就是map.entry类型
		 * 
		 * 
		 * */
		Set<Map.Entry<Integer, String>> entrySet=map.entrySet();
		Iterator<Map.Entry<Integer, String>> it= entrySet.iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, String> me= it.next();
			Integer key=me.getKey();
			String value=me.getValue();
			//System.out.println(key+" "+value );
		}
	}
	
	public static void method2(Map<Integer,String> map) {
		map.put(8, "wang wu");
		map.put(2, "zhao liu");
		map.put(7, "xiao qiang");
		map.put(6, "wang cai ");
		
		//  get all map's elements
		// 通过ketset 方法获取map 中所有的key 所在的set 集合， 在通过set 的iterator 个体get  each key 
		
		Set<Integer> keySet= map.keySet();
		Iterator<Integer> it= keySet.iterator();
		while(it.hasNext()) {
			Integer key=it.next();
			String value=map.get(key);
			System.out.println(key+" "+value);
		}
	}
	
	
	public static void method(Map<Integer , String > map) {
		
		System.out.println(map.put(8, "wang cai "));// null 
		System.out.println(map.put(8, "xiao qiang "));// wang cai  put same key , value will be override
		map.put(2, "zhang san");
		map.put(7, "zhao liu ");
		//map.put(3, "li si ");
	
		//  delete 
		//System.out.println("remove:"+map.remove(2));
		
		// boolean 
		//System.out.println(map.containsKey(7));
		
		// get 
		System.out.println("get:"+map.get(6));
		System.out.println(map);
	}
	
}
