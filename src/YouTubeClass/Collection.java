package YouTubeClass;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection {
	
	// Iterator 
	// is collection get items
	// 几个的去除元素的方式
	//vector
	public static void main(String[] args) {
		method_get();
	}
	public static void method_get() {
		ArrayList<String> a1= new ArrayList<>();
		a1.add("java1");
		a1.add("java2");
		a1.add("java3");
		a1.add("java4");
		a1.add("java5");
	
		  Iterator<String> it = a1.iterator();
		  // hasNext() return true or false , 
		  while(it.hasNext()) {
			  sop(it.next());
		  }
	}
	public static void sop(Object obj) {
		System.out.println(obj);
	}
	
}
