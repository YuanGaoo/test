package CodingChallange;

public class reverInt {
	public static void main(String[] args) {
		int i = 123456;

		System.out.println(reverseInt(i));
		System.out.println(reversIntStrBuffer(i));
	}
	
	
	// using algo
	public static int reverseInt(int num) {
		int temp = 0;
		while(num !=0) {
			temp = temp * 10 + num %10;
			num= num /10;
		}
		return temp;
	}
	//using StringBuffer method
	public static int reversIntStrBuffer(int num) {
		String newN= new StringBuffer(String.valueOf(num)).reverse().toString();
		
		return Integer.parseInt(newN);
	}
	
}
