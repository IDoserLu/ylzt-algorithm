package com.ylzt.algorithm.study.sort;

public class BubbleSort {
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
	
}
