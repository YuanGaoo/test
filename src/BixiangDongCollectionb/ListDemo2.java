package BixiangDongCollectionb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList<>();
//		list.add("abc1");
//		list.add("abc2");
//		list.add("abc3");
//		ListIterator it= list.listIterator();
//		while(it.hasNext()) {
//			Object obj= it.next();
//			if(obj.equals("abc2")) {
//				it.set("abc9");
//			}
//		}System.out.println(list);
		
	}

	private static void show(List list) {
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		ListIterator it= list.listIterator();
		while(it.hasNext()) {    
			Object obj=it.next();
			if(obj.equals("abc2")) {
				it.add("abc9");
			}
		}  System.out.println(list);
		
//		while(it.hasNext()) {     java.util.ConcurrentModificationException
//			Object obj=it.next();
//			if(obj.equals("abc2")) {
//				list.add("abc9");
//			}
//			else {
//				System.out.println(obj);
//			}
//			
//		}System.out.println(list);
		
	}

}
