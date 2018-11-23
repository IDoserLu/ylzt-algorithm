package com.ylzt.algorithm.study.sort;

import java.util.Arrays;
/**
 * 简单选择排序
 * @author Administrator
 *	总的时间复杂度O(n^2)
 */
public class SelectSort {
	
    public static void main(String[] args) {
        int[] arr = {46,58,15,45,90,18,10,62};
        sort(arr);
        System.out.println("排序后："+Arrays.toString(arr));
    }
    
    public static void sort(int[] arr) {
    	
        for (int i = 0; i < arr.length; i++) {
            int min = i;//存放较小元素的数组下标
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
            	int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
            }
            System.out.println("第"+i+"趟："+Arrays.toString(arr));
        }
    }

}
