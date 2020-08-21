package Test2020;

public class SwapWithOutThirdVar {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		
//		1. 
//		x = x+y; //15
//		y = x - y; // y = 5;
//		x = x - y;
		
//		
//		2. 
		x = x* y; 
		y = x/y;
		x = x/y;
		System.out.println("X::"+x);
		System.out.println("Y::"+y);

	}
	
	

}
