
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SoteSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<Integer> sSet= new TreeSet<>();
		sSet.add(123);
		sSet.add(234);
		sSet.add(122);
		sSet.add(442);
		sSet.add(331);
		System.out.println(sSet);
		System.out.println("==================");
		SortedSet<String> ss= new TreeSet<>();
		ss.add("C");
		ss.add("B");
		ss.add("F");
		ss.add("O");
		ss.add("W");
		System.out.println(ss.size());
		System.out.println("all item -->"+ss);
		System.out.println(ss.headSet("F"));
		System.out.println(ss.tailSet("O"));
		System.out.println(ss.subSet("C", "O"));
		//System.out.println(ss.tailSet("abcbs"));
		
		
	}

}
