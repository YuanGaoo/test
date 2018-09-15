package colloction;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.naming.ldap.SortControl;

public class ColloctionTest {
	public static void main(String[] args) {
		List<Long> price= new ArrayList<>();
		price.add(33l);
		price.add(33l);
		price.add(11l);
		price.add(11l);
		price.add(33l);
		price.add(22l);
		price.add(2333l);
		price.add(1111l);
		price.add(44l);
		System.out.println(price);
		Set<Long> set= new HashSet<>(price);
		SortedSet<Long> sSet= new TreeSet<>(set);
		
		System.out.println(sSet);
		System.out.println(sSet.subSet(22L, 1111L));
		System.out.println(sSet.tailSet(44L));
		
		
		
		
	
		
		
		
		
		
		
	}
}
