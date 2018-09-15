package PropertyClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrySecondNumber {
	
	public static void main(String[] args) {
		List<String> some= new ArrayList<>();
		some.add("aaa");
		some.add("bbbb");
		some.add("aaaaa");
		some.add("aaaaa");
		some.add("aaaaa");
		some.add("bbbb");
		some.add("cccccc");
		some.add("dddd");
		some.add("dddd");
		some.add("eeeeeee");
		some.add("eeeeeee");
		Map<String, Integer> map = new HashMap<>();
		for (String string : some) {

			if (map.get(string) == null ) {
				map.put(string, 1);
			}

			else if (map.get(string) != null ) {
				map.put( string, map.get(string) + 1);
			}
		}
		System.out.println(map);
	}
}
