package com.ylzt.algorithm.study.sort;

import java.util.Arrays;

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
		System.out.println(Arrays.toString(arr));
		sort(arr,low,i-1);
		sort(arr,i+1,high);
	}

	public static void main(String args[]) {
		int[] array=new int[] {5,9,7,5,8,9};
		System.out.println(Arrays.toString(array));
		sort(array,0,array.length-1);
		System.out.println(Arrays.toString(array));
	}

}
