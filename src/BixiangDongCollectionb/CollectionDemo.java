package BixiangDongCollectionb;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
	public static void main(String[] args) {
//		Collection coll= new ArrayList();
//		Collection coll2= new ArrayList();
//		show(coll,coll2);
		int a=5;
		int b=10;
		b=b-a;
		a=a+b;
		
		
	}
	public static void show(Collection<String> c1,Collection<String> c2) {
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");
		
		c2.add("abc2");
		c2.add("abc6");
		c2.add("abc7");
		c2.add("abc8");
		
		// att all
//		System.out.println("c1:"+c1);
//		System.out.println("c1:"+c2);
//		c1.addAll(c2);// add c2 elementd to  c1
//		System.out.println("c1:"+c1);
		
		// show removeAll ----> delete two object's same elements 
//		boolean b= c1.removeAll(c2);// remove same elements from the collection who be called removeAllmethod; 
//		System.out.println("removeAll:"+b);
		
//		System.out.println("c1:"+c1);
		
		// show containsAll
//		boolean b =c1.containsAll(c2);
//		System.out.println("containsAll:"+b);
//		System.out.println("c1:"+c1);
		
		// retain all ---->  keep both object's same elements , and delete different element, just 相反的from delete all
		boolean b= c1.retainAll(c2);
		System.out.println(c1);
	}
	public static void show(Collection<String> coll) {
		// 1, add elements. add();
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		coll.add("abc4");
		
		//delete elements 
		coll.remove("abc1");
		
		
		System.out.println(coll);

		
	}
}
