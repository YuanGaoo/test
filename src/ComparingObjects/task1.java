package ComparingObjects;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class task1 {


	public static void main(String[] args) {
		List<String> names= Arrays.asList("adam","adam","bob","davie","bob");
			Map<String,Integer> freMap= new HashMap<>();
			int count=0;
			for (String each : names) {
				if(! freMap.containsKey(each)) {
				freMap.put(each,1);
				}else {
					count=freMap.get(each);
					freMap.put(each, count+1);
				}			
			}
			System.out.println(freMap);
		
			
			
			
	}
}
