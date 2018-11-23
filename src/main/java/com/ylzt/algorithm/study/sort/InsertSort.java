package com.ylzt.algorithm.study.sort;

public class InsertSort {
	/***
	 * 插入排序
	 * @param arr
	 */
	public static void sort(int[] arr){
		int temp = 0;
		for(int i = 1; i < arr.length;i++){
			for(int j = i;j > 0;j--){
				if(arr[j-1] > arr[j]){
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
}
