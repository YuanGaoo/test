package BixiangDongCollectionb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class previousTest {
	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
			list.add("abc1");
			list.add("abc2");
			list.add("abc3");
			list.add("abc4");
			list.add("abc5");
			
			ListIterator<String> it= list.listIterator();
			while(it.hasNext()) {
				String st=it.next();
				if(st.equals("abc3")) {
					it.set("abc521");
				}
				
			}
			System.out.println("hasNext:"+it.hasNext());
			System.out.println("hasPrevious:"+it.hasPrevious());
			System.out.println("list:"+list);
			
	while(it.hasPrevious()) {
		System.out.println(it.previous());
	}
			
		
		
	}

}
