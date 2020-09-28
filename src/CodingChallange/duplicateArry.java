package CodingChallange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class duplicateArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 5, 1, 6, 8, 9, 0, 5, 2, 8 };
		System.out.println(Arrays.toString(findDuplicate(arr)));
		
		System.out.println(palindromeInt(121));
		System.out.println("String palindrom::"+palindromeString("aba"));

	}

	public static int[] eliminateDuplicates(int[] list) {
		int newLength = list.length;
		// find length w/o duplicates:
		for (int i = 1; i < list.length; i++) {
			for (int j = 0; j < i; j++) {
				if (list[i] == list[j]) { // if duplicate founded then decrease length by 1
					newLength--;
					break;
				}
			}
		}

		int[] newArray = new int[newLength]; // create new array with new length
		newArray[0] = list[0]; // 1st element goes to new array
		int inx = 1; // index for 2nd element of new array
		boolean isDuplicate;
		for (int i = 1; i < list.length; i++) {
			isDuplicate = false;
			for (int j = 0; j < i; j++) {
				if (list[i] == list[j]) { // if duplicate founded then change boolean variable and break
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) { // if it's not duplicate then put it to new array
				newArray[inx] = list[i];
				inx++;
			}
		}
		return newArray;
	}

	public static int[] findDuplicate(int[] arr) {
		int newSize=arr.length;
		for(int i =0; i < arr.length; i++) {
			for(int j=1; j< i; j++) {
				if(arr[i]==arr[j]) {
					newSize--;
				}
			}
		}
		
		int[] newArr = new int[newSize];
		newArr[0] = arr[0];
		int index =1;
			for(int i=1; i < arr.length; i++ ) {
				boolean bo = false;
				for(int j =0; j< i; j++) {
					if(arr[i]==arr[j]) {
						bo = true;
						break;
					}
				}
				if(!bo) {
					newArr[index] = arr[i];
					index++;
				}
			}
			return newArr;
	}
	
	public static boolean isPrimeNum(int num) {
		if(num <=1) return false;
		for(int i = 2; i< num;i++) {
			if(num % i == 0) return false;
		}
		return true;
	}
	
	public static List<Integer> getPrimeNum(int num){
		List<Integer> primeNum	= new ArrayList<>();
		for( int i = 2; i > num; i++) {
			if(isPrimeNum(i)) primeNum.add(i);
		}
		return primeNum;
	}
	
	public static boolean palindromeInt(int num) {
		int newNum=0;
		int temp = num;
		while(num!=0) {
			newNum = newNum*10 + num%10;
			num /= 10;
		}
		
		return newNum == temp;
	}
	
	public static boolean palindromeString(String str) {
		String newStr = "";
		String temp = str;
		for(int i = str.length()-1; i>=0; i--) {
			newStr += str.charAt(i);
		}
		return temp.equals(newStr);
	}
	
	public int[] separateEvenOddNum(int[] arr) {
		int left=0;
		int right= arr.length-1;
		for(int i =0; i< arr.length; i++) {
			while(arr[i]%2 == 0) {
				left ++;
			}
			while(arr[i]%2 == 1) {
				right --;
			}
			
			if(left<right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] =temp;
			}
			
		}
		return arr;
	}
	
	

}
