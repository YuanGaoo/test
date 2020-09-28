package CodingChallange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromeTest {

	public static void main(String[] args) {

		// System.out.println(isPalindrome(13231));
		int[] ar = {1,2,3,4,5,6,7,8,9,10,11};
		System.out.println(Arrays.toString(separateEvenOddNumbers(ar)));

	}

	public static boolean isPalindrome(int num) {
		int temp = num;
		int revers = 0;
		if (num <= 10)
			return false;

		while (num > 0) {
			revers = revers * 10 + num % 10;
			num = num / 10;
		}

		if (temp == revers)
			return true;
		return false;

	}

	public static void evenOdds(int[] nums) {
		int a = 0, b = nums.length - 1;

		while (a < b) {
			while (nums[a] % 2 == 0 && a < b) {
				a++;
			}
			while (nums[b] % 2 == 1 && a < b) {
				b--;
			}
			if (a < b) {
				int temp = nums[a];
				nums[a] = nums[b];
				nums[b] = temp;
				a++;
				b--;
			}
		}

	}

	public static int[] separateEvenOddNumbers(int arr[]) {
		int left = 0;
		int right = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {

			while (arr[left] % 2 == 0) {
				left++;
			}
			while (arr[right] % 2 == 1) {
				right--;
			}

			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}
		return arr;
	}

}
