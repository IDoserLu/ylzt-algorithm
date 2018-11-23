package com.ylzt.algorithm.study.sort;

public class ShellSort {
	/***
	 * 希尔排序 len = 6 step = len/2;  3
	 *   2 1 0 5 3  4
	 *   {2,5} {1,3} {04}
	 *   
	 * 
	 * @param arr
	 */
	public static void sort(int[] arr){
		int step = arr.length/2;
		int temp = 0;
		while(step > 0){
			if(step > 0){
				for(int i = step; i < arr.length;i++){
					for(int j = i;j-step >= 0;j--){
						if(arr[j-step] > arr[j]){
							temp = arr[j-step];
							arr[j-step] = arr[j];
							arr[j] = temp;
						}
					}
				}
				step = step/2;
			}
		}
	}
	
}
