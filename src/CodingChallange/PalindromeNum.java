package CodingChallange;

public class PalindromeNum {

	public static void main(String[] args) {
		System.out.println(isPalindromeNm(151));
	}

	public static boolean isPalindromeNm(int num) {
		// 151
		int r = 0;
		int sum = 0;
		int temp= num;
		while (num > 0) {
			r = num % 10;
			sum = sum * 10 + r;
			num = num / 10;
		}
		if (temp == sum)
			return true;
		return false;
	}

}
