package YouTubeClass;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

public class reversInt {

	public static void main(String[] args) {
//		int i = 12345;
//		int b = 0;
//	
//		while(i != 0) {
//			b = b*10+i%10; //5
//			i = i/10;	
//		}
//		
//		System.out.println(b);

		
		String str= "12735o45y7hkjdhfgahdou91";
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (int i = 0; i < str.length(); i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);	
			}else {
				map.put(str.charAt(i), 1);	
			}
		}
		System.out.println(map);
	}

}
