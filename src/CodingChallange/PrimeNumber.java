package CodingChallange;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println(isPrimeNumber(17));
		getPrimeNumbers(40);

	}

	private static boolean isPrimeNumber(int num) {
		if(num <= 1)
			return false;
		for(int j = 2; j < num; j ++) {
			if(num  % j == 0) {
				return false;
			}
		}
		return true;
		
	}
	
	public static void  getPrimeNumbers(int num) {
		for(int i =2; i <= num; i ++) {
			if(isPrimeNumber(i)) {
				System.out.print(i+" ");
			}
		}
	}
	
	

}
