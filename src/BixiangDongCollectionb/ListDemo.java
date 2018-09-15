package BixiangDongCollectionb;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<Object> list= new ArrayList<>();
		show(list);
	}

	private static void show(List<Object> list) {
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		System.out.println(list);
//		list.add(1,"abc9");
//		System.out.println(list);
		
		//delete element
	//	System.out.println("remove:"+list.remove(2));
		
		//Modified
		//System.out.println(list.set(1, "indeaa"));
		
		// get elements
		System.out.println(list.get(0));
		System.out.println(list);
		
		
	}
}
