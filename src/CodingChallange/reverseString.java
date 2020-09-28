package CodingChallange;

public class reverseString {

	public static void main(String[] args) {
		String s = "Selenium";
		String b = "";
		for (int i = s.length()-1; i >= 0; i--) {
			b += s.charAt(i);
		}
		System.out.println(revers(s));
		
		System.out.println(useStrBuffer(s));

	}
	
	//for loop
	public static String revers(String str) {
		String newStr = "";
		for (int i = str.length()-1	; i >=0; i--) {
			newStr +=str.charAt(i);			
		}
		
		return newStr;
	}
	
	//String Buffer
	public static String useStrBuffer(String str) {
		StringBuffer stb = new StringBuffer(str);
		
		return stb.reverse().toString();
	}
	
	

}
