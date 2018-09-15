
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class interview {
	public static void main(String[] args) {
		String input= "abafeas";
		char[] ch= input.toCharArray();
		Set<Character> set= new HashSet<>();
			for (int i = 0; i < ch.length; i++) {
			//	set.add(ch[i]);
			}	
			//System.out.println(set);
			String uni="";
			for (char cha : ch) {
				if(!uni.contains(cha+"")) {
					uni+=cha;
				}
			}
			//System.out.println(uni);
			
			//add(5,5);
			
		//sub("885-42-9640");
		int []arr= {15,3,1,23,4,2};
		int num=arr[0];
		for(int i=1;i<arr.length;i++) {
			
		}
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
		
}
	
	public static int[] sort(int[] arr) {
		int [] temp= new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			int temper=0;
			for(int j=1;j<arr.length-1;j++) {
				if(arr[i]>arr[j]) {
					temper=arr[i];
					arr[i]=arr[j];
					arr[j]=temper;
					
				}
				
			}
		}
		return temp;
		
	}
	
	public static void sub(String str) {
		String str2="XXX-XX-";
		
		System.out.println(str2+str.substring(7));
	}
	public static  void add(int a,int b) 
	{
		
		for(int i=0;i<b;i++) {
			a=a*2;//=10
			System.out.println(a);
			
		}
		
		
	}

	
	public static void dupli(List<Integer> some) {
		//1,2,3,4,5,1
		Map<Integer, Integer> map = new HashMap<>();
		for (Integer integr : some) {
 
 			if (map.get(integr) == null ) {
				map.put(integr, 1);
			}
			else if (map.get(integr) != null ) {
				map.put(integr, map.get(integr) + 1);
			}
		}
		System.out.println(map);
	}
	
}
			
	

