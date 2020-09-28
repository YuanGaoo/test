package CodingChallange;

public class swapNumber {

	public static void main(String[] args) {
		int i = 5;
		int j = 10;

//		i = i + j; // 15
//		j = i - j; // 15 - 10 = 5
//		i = i - j;
//
//		System.out.println(i);
//		System.out.println(j);
//		
		// 2. 
		int q = 10;
		int p = 5;
		q = q * p; //50
		p = q / p;  // 50 / 5 = 10
		q = q / p;  // 50 / 10 = 5
		
		System.out.println(q);
		System.out.println(p);
		

	}

}
