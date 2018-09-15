
public class TryDo {
	public static void main(String[] args) {
		String a="yuan";
		String b="gaoaa";
		b=a+b;//yuangao
		a=b.substring(a.length());
		System.out.println(a);
		b=b.substring(0,b.length()-a.length());
		System.out.println(b);
		
		 System.out.println("change");
		System.out.println(revers("hellpo"));
	}
	
	public static String revers(String word) {
		String temp="";
		// hello
		 if(word.length() == 1)
		     return word;
		 
		 temp+=revers(word.substring(1))+word.charAt(0);
		 System.out.println(temp);
		   return temp;
		  
		   
		   
	}
}
