package BixiangDongCollectionb;

import java.time.LocalDate;

public class datetime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String date = LocalDate.now().toString();
		System.out.println(date);
		String [] arr= date.split("-");
		String newDate="";
		int num=Integer.parseInt(arr[2]);
		if(num<10) {
			newDate=arr[1]+"/0"+(num+1)+"/"+arr[0];
		}else
		newDate=arr[1]+"/"+(num+1)+"/"+arr[0];
		
		System.out.println(newDate);
		
	}


}
