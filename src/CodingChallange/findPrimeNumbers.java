package CodingChallange;

import java.util.ArrayList;
import java.util.List;

public class findPrimeNumbers {

	public static void main(String[] args) {
		System.out.println(isPrimeNum(11));
		System.out.println(getPrimeNum(40));
	}
	
	public static boolean isPrimeNum(int num) {
		if(num <= 1) return false;
		for(int i = 2; i < num;i ++) {
			if(num % i == 0) return false;
		}
		return true;
	}
	
	public static List<Integer> getPrimeNum(int num){
		List<Integer> primeNum = new ArrayList<>();
		for(int i = 2; i < num; i ++) {
			if(isPrimeNum(i)) primeNum.add(i);
		}
		return primeNum;
	}
	
}
