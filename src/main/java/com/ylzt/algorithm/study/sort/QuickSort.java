package com.ylzt.algorithm.study.sort;

public class QuickSort {
	public static void sort(int[] arr,int low,int high){
		int i = low;
		int j = high;
		
		if(i > j){
			return;
		}
		int base = arr[low];
		int temp = 0;
		int temp1 = 0;
		while(i != j){
			while(arr[j] >= base && i < j){
				j--;
			}
			while(arr[i] <= base && i < j){
				i++;
			}
			if(i < j){
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		temp1 = arr[low];
		arr[low] = arr[i];
		arr[i] = temp1;
		sort(arr,low,i-1);
		sort(arr,i+1,high);
	}


}
