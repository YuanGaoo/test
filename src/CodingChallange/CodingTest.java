package CodingChallange;

public class CodingTest{
  public static void main(String[] args){
    System.out.print(reversStr("Yuan Gao"));
    System.out.print(reversInt(12345));

  }

  public static String reversStr(String str){
    String newStr="";
    for(int i = str.length()-1; i >=0; i-- ){
      newStr += str.charAt(i);
    }
    return newStr;
  }
  
  public static int reversInt(int num) {
	  int temp = 0;
	  while(num != 0) {
		  temp = temp * 10 + num %10;
		  num /= 10;
	  }
	  return temp;
  }
}