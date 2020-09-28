package CodingChallange;

public class LargestAndSmallestNum {

	public static void main(String[] args) {
		int[] num = { 1, 2, 4, -1, -23, 14, 55, 123, 3, 4, 68, 3 };
		int lar = num[0];
		int small = num[0];

		for (int i = 0; i < num.length; i++) {
			if (num[i] > lar) {
				lar = num[i];
			} else if (num[i] < small) {
				small = num[i];
			}
		}
		System.out.println(lar);
		 System.out.println(small);

	}

	public static void larget(int[] arr) {
		int largest = arr[0];
		int smallest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			} else if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("Largest ::" + largest + "\n" + "smallest::" + smallest);
	}

}
