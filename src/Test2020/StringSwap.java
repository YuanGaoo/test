package Test2020;

public class StringSwap {

	public static void main(String[] args) {
		String a = "Helloaa";
		String b= "word is besta";
		
		System.out.println("Before swaping::");
		System.out.println("The value a::"+a);
		System.out.println("The value b::"+b);
		
		
		System.out.println("---------------after---------");
		a = a+b;
		b = a.substring(0,a.length()-b.length());
		a= a.substring(b.length());
		System.out.println("a :::::"+a);
		System.out.println("b::::::"+b);
	}

}
