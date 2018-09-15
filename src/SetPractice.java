
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPractice {
	public static void main(String[] args) {
		Set<Integer> numSets= new HashSet<>();
		//HashSet<Integer> numSet2= new HashSet();
		numSets.add(123);
		numSets.add(123);
		numSets.add(444);
		numSets.add(222);
		numSets.add(222);
		numSets.add(21);
		for(Integer each:numSets) {
		//	System.out.println(each);
		}
		Iterator<Integer> setIte=numSets.iterator();
		while(setIte.hasNext()) {
			Integer i=setIte.next();
			if(i>200) {
				setIte.remove();
			System.out.println(i);
			}
			
		}
		System.out.println(numSets);
	}
}
