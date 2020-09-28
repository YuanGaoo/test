package Test2020;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringSwap {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6}; // expected output 2,4,6,1,3,5
		
		System.out.println(Arrays.toString(returnEvenOdd(arr)));
		
	}
	
	public static int[] returnEvenOdd(int [] arr) {
		int a = 0, b = arr.length - 1;
		
		
		while(a < b) {
			 while(arr[a] %2 == 0 && a < b) {
				 a ++;
			 }
			 while(arr[b]% 2 == 1 && a < b) {
				 b --;
			 }
			 if(a < b) {
				 int temp = arr[a];
				 arr[a] = arr[b];
				 arr[b] = temp;
				 a ++;
				 b --;
			 }
		}
		return arr;
	}
		
}
