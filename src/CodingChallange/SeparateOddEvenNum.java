package CodingChallange;

import java.util.Arrays;

public class SeparateOddEvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i = {1,2,3,4,5,6,7,8,9,10,11};
		System.out.println(Arrays.toString(separateNum(i)));
	}
	
	public static int[] separateNum(int[] nums) {
		int left = 0;
		int right = nums.length-1;
		for(int i = 0; i < nums.length;i ++) {
			while(nums[left] % 2==0) {
				left ++;
			}
			while(nums[right] %2 ==1) {
				right --;
			}
			if(left < right) {
				int temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;
				
			}
		}
		return nums;
	}

}
