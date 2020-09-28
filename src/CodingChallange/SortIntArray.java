package CodingChallange;

import java.util.Arrays;

public class SortIntArray {

	public static int[] sortFunction(int arr[]) {
		boolean sorted = false;
		int temp;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		return arr;
	}

	public static int[] sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 4, 5,4, 6, 7, 9,3,1 };
		System.out.println(Arrays.toString(sort(arr)));
	}
}
