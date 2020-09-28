package CodingChallange;

public class swapString {

	public static void main(String[] args) {
		String a = "abc";
		String b = "efg";
		
		System.out.println("before swapping::");
		System.out.println("a::"+a);
		System.out.println("b::"+b);
		
		// 1. appened a and b
		a = a+b; //abcefg
		System.out.println("Length::"+a.length()+"B length"+b.length());
		
		b = a.substring(0,a.length()-b.length());
		a = a.substring(b.length());
		System.out.println("After Swapping aaa::"+a);
		System.out.println("After Swapping BBB::"+b);
		try {
			
		} catch (Exception e) {
			
		}
		
	}

}
