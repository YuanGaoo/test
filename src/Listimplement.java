import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Listimplement {
	public static void main(String[] args) {
	
		Collection<Integer> integer= new ArrayList<>();
		integer.add(1);
		integer.add(1);
		integer.add(3);
		integer.add(1);    
		integer.add(5);
		integer.add(6);
		integer.add(2);
		
		Set setup=new HashSet<>(integer);
		System.out.println(setup);
		
		Listimplement lm = new Listimplement();
		
		System.out.println(lm.some(5, 2));
		
		
		}
	
	public static Map<Integer, Integer> some(int number, int divisor) {
		
		Map<Integer, Integer> map = new HashMap();
		
		map.put(number*(1/divisor), (number*1/divisor - divisor));
		
		return map;
		
	}
}
