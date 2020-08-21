package Test2020;

import java.util.Arrays;

public class SortNum {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,44,22,33,123,-12,4567,0,1928,-1};
//		findLargestAndSmallestNum(arr);
//		sortNum(arr);
		bubbleSort(arr);
	}
	
	
	
	public static void findLargestAndSmallestNum(int[] arr) {
		int largest =arr[0];
		int smallest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]> largest) {
				largest = arr[i];
			}else if(arr[i]<smallest){
				smallest = arr[i];
			}
		}
		System.out.println("ARRAYS::"+Arrays.toString(arr));
		
		System.out.println("largest::"+largest);
		System.out.println("smallest::"+smallest);
	}
	
	public static void sortNum(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("After sort::"+Arrays.toString(arr));
	}
	
	public static void bubbleSort(int[]arr) {
		boolean sorted = false;
		int temp;
		while(!sorted) {
			sorted = true;
			for (int i = 0; i < arr.length-1; i++) {
				if(arr[i]>arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1]=temp;
					sorted = false;
				}
			}
		}
		System.out.println("Bubble Sort, After sort::"+Arrays.toString(arr));
	}
}
