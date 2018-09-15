package BixiangDongCollectionb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
	 public static void main(String[] args) {
		Collection<String> coll= new ArrayList<String>();
			coll.add("abc1");
			coll.add("abc2");
			coll.add("abc3");
			coll.add("abc4");
		
		  // use the method iterator() method from collection,
			//call the method iterator()from  collection use to get the elements from collection,
			//Iterator<String> it = coll.iterator();
//			while(it.hasNext()) {
//				System.out.println(it.next());
//			}
			for(Iterator itr= coll.iterator();itr.hasNext();) {
				System.out.println(itr.next());
			}
			
		
	}

}
