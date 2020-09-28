package CodingChallange;

import java.util.Arrays;

public class removeDuplicate {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,1,5,6,3};
		System.out.println(Arrays.toString(removeDupl(arr)));

	}

	public static int[] removeDupl(int[] arr) {
		int newLeng = arr.length;
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					newLeng--;
					break;
				}
			}
		}

		int[] newArr = new int[newLeng];
		newArr[0] = arr[0];
		int n = 1;

		boolean duplicate;
		for (int i = 1; i < arr.length; i++) {
			duplicate = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					duplicate = true;
					break;
				}
			}
			if (!duplicate) {
				newArr[n] = arr[i];
				n++;
			}
		}
		return newArr;

	}

	
	

}
