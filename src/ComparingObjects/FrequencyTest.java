package ComparingObjects;



import java.util.HashMap;
import java.util.Map;

public class FrequencyTest {
	public static void main(String[] args) {
		String str="sdfasdfaskdjfaoijiwojnlasbbcz";
		Map<Character,Integer> map=new HashMap<>();
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), 1);
			}else {
				
				count=map.get(str.charAt(i));
				//.out.println(map.ge)+"count is :");
				map.put(str.charAt(i), count+1);
			}	
		}
		System.out.println(map);
//		char [] st= str.toCharArray();
//		Map<String,Integer> map=new HashMap<>();
//		for (String each : str) {
//			
//		}
	}
}
