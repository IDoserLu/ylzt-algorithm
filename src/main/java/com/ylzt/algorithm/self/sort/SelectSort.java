package com.ylzt.algorithm.self.sort;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 选择排序  
 * 时间复杂度：O(n^2)
 * 原地排序
 * 不稳定排序
 * 
 * @author Administrator
 *
 */
public class SelectSort {
	private static Logger Logger=LoggerFactory.getLogger(SelectSort.class);

    /**
     * 5 8 7 5 2 1
     * 1 5 8 7 5 2
     * 1 2 5 8 7 5 
     * 1 2 5 5 8 7
     * 1 2 5 5 7 8
     * 思路：从未排序区间选择最小的插入到已排序的末尾
     * @param array
     */
	public static void sort(int[] array) {
		int length=array.length;
		for(int i=0;i<length;i++){//已排序
			int min=array[i],k=i;
			for(int j=i;j<length;j++) {//未排序
			 if(min>array[j]) {
				 min=array[j];
				 k=j;//找到最终的最小值的下标
			 }
		}
		if(k!=i) {
		 SortUtil.swap(array, i, k);
		}
		Logger.debug("选择排序,趟数{},{}",i+1,Arrays.toString(array));
	  }
		  Logger.info("选择排序结果:{}",Arrays.toString(array));
	}
	
	
	public static void sort1(int[] array) {
		int length=array.length;
		for(int i=0;i<length;i++){//已排序
			int min=array[i];
			for(int j=i;j<length;j++) {//未排序
			 if(min>array[j]) {
				 min=array[j];
			     SortUtil.swap(array, i, j);//将未排序的首个与后边找出的最小交换位置
			 }
		}
		Logger.debug("选择排序,趟数{},{}",i+1,Arrays.toString(array));
	  }
		  Logger.info("选择排序结果:{}",Arrays.toString(array));
	}
	
	public static void sort2(int[] array) {
		int length=array.length;
		for(int i=0;i<length;i++) {
			 int min=i;
			 for(int j=1;j<length;j++) {
			   if(array[min]>array[j]) {
				   min=j;//使用下标替换
			   }
			 }
			if(min!=i) {
				SortUtil.swap(array, i, min);
			} 
		Logger.debug("选择排序,趟数{},{}",i+1,Arrays.toString(array));	 
		}
		Logger.info("选择排序结果:{}",Arrays.toString(array));
	}
	
}
