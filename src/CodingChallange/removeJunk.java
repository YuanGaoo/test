package CodingChallange;

public class removeJunk {

	public static void main(String[] args) {
		String str= "啊啊可视对讲发货 sdfalwaew 123456789";
		
		//regular expression; [a-zA-Z0-9]
		System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));
		
		String s1 = ".,;p12!@#! stest $!@^&";
		s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
	}

	
}
