package CodingChallange;

public class stringManipulation {

	public static void main(String[] args) {
		String str = "My name is Yuan Gao names";
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println("index of s::" + str.indexOf("n", 7));
		System.out.println(str.indexOf("n", str.indexOf("n") + 1));

		String name = "YuanGao";
		System.out.println(name.substring(3));
		System.out.println(name.replace('u', '0'));
	}

}
