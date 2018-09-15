import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {
	public static void main (String[] arr) {
		int num=12345678;
		int b=num%10;
		System.out.println(b);
//		String str=String.valueOf(num);
//		String temp="";
//		for(int i= str.length()-1;i>=0;i--) {
//			temp+=str.charAt(i);
//		}
//		System.out.println(temp);
//		
		int temp=0;
		for(int i=num;i!=0;i/=10) {
			temp=temp*10+i%10;//0+8=8
			//System.out.println(i);
		}
		System.out.println(temp);
		
		String rever= "hello";
		char[] ch=rever.toCharArray();
		Map<Character,Integer> map= new HashMap<>();
		for(int i=0;i<ch.length;i++) {
			if(!map.containsKey(ch[i])) {
				map.put(ch[i], 1);
			}else {
				map.put(ch[i], map.get(ch[i])+1);
			}
		}
		System.out.println(map);
		
		long other=123451231417753l;
			
		String strr=String.valueOf(other);
		char[] cha=strr.toCharArray();
		Set<Character> set=new HashSet<>();
		for(char ch1:cha)
		  set.add(ch1);
		
		System.out.println(set);		
		String word="hwlloawer";
		Map<Character,Integer>mapp=new HashMap<>();
		for(int i=0;i<word.length();i++) {
			if(!mapp.containsKey(word.charAt(i))) {
				mapp.put(word.charAt(i), 1);
			}else {
				mapp.put(word.charAt(i), mapp.get(word.charAt(i))+1);
			}
		}
		System.out.println(mapp);
	}
}
