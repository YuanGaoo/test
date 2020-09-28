package CodingChallange;

public class missingNumber {

	public static void main(String[] args) {
		int a[] = { 11, 2, 4, 5, 3, 6, 7, 8, 9 };
		missingNum(a);
	}

	public static void missingNum(int[] arr) {
		int sum = 0;
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}

		}
		System.out.println(sum);
		System.out.println(max);
		System.out.println(min);
		// find max num

		int sum2 = 0;
		for (int j = min; j <= max; j++) {
			sum2 += j;
		}
		System.out.println(sum2 - sum);
	}

}
