
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class setIteratorForLoop {

	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		list.add("3");
		list.add("3");
		list.add("1");
		list.add("3");
		list.add("1");
		list.add("2");
		list.add("1");
		list.add("2");
		list.add("2");
		list.add("2");
		list.add("2");
		list.add("3");
		
		Set numSets= new HashSet<>(list);
		//HashSet<Integer> numSet2= new HashSet();
//		 Set uniqueSet = new HashSet(list);
//	        for (String temp : uniqueSet) {
//	            System.out.println(temp + ": " + Collections.frequency(list, temp));
//	        }
//	 
		System.out.println(numSets);
		for(String num:list) {
			System.out.println(num+":"+Collections.frequency(list, num));
		}
		//Iterator<Integer> setIte=numSets.iterator();
		
//		for (Iterator<Integer> setIte=numSets.iterator(); setIte.hasNext();) {
//			System.out.println(setIte.next());
//		}
	}

}
