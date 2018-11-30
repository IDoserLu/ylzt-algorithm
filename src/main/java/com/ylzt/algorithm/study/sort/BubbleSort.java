package com.ylzt.algorithm.study.sort;

import java.util.Arrays;

public class BubbleSort {
	private static int[] array=new int[] {6,5,4,2,1};
	
	/***
	 * 冒泡排序  
	 *  len = 6
	 * 6 4  2  1    3   5 
	 */
	public static void sort(int[] arr){
		int temp = 0;
		for(int i = 0 ; i < arr.length-1;i++){
			for(int j = 0; j < arr.length-i-1;j++){
				if(arr[j+1] < arr[j]){
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void main(String args[]) {
		sort(array);
		System.out.println(Arrays.toString(array));
		
	}
	
}
