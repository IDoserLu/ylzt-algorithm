package com.ylzt.algorithm.self.sort;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 冒泡排序算法
 * 时间复杂度：O(n^2)
 * 原地排序
 * 稳定排序
 * 
 * @author Administrator
 *
 */
public class BubbleSort {
	private static Logger Logger=LoggerFactory.getLogger(BubbleSort.class);
	
	 /** 大的往后排
	 * 5,6,4,3,2,1
	 * 5,6,4,5,2,1
	 * 第一趟 5,4,3,2,1,6
	 * 第二趟 4,3,2,1,5,6
	 * 第三趟 3,2,1,4,5,6
	 * 第四趟 2,1,3,4,5,6
	 * 第五趟 1,2,3,4,5,6
	 */
	public static void sort(int[] array) {
		int length=array.length;
		for(int i=0;i<length;i++) {//趟数
			for(int j=1;j<length-i;j++) {
				if(array[j]<array[j-1]) {
					SortUtil.swap(array, j, j-1);
				}
			}
			Logger.debug("冒泡排序,趟数{},{}",i+1,Arrays.toString(array));
		 }
	    Logger.info("冒泡排序结果:{}",Arrays.toString(array));
	}
	
	/**
	 * 优化趟数
	 * @param array
	 */
	public static void sort_opt(int[] array) {
		int length=array.length;
		for(int i=0;i<length;i++) {
			boolean swap=false;
			for(int j=1;j<length-i;j++) {
				if(array[j]<array[j-1]) {
					SortUtil.swap(array, j, j-1);
				    swap=true;
				}
			}
			Logger.debug("冒泡排序,趟数{},{}",i+1,Arrays.toString(array));
			if(!swap) break;
		}
	   Logger.info("冒泡排序结果:{}",Arrays.toString(array));

	}
	
	
	
	
	
	/** 小的往前排
	 * 5,6,4,3,2,1
	 * 第一趟 1,5,6,4,3,2
	 * 第二趟 1,2,5,6,4,3
	 * 第三趟 1,2,3,5,6,4
	 * 第四趟 1,2,3,4,5,6
	 */
	public static void sort1(int[] array) {
		int length=array.length;
		for(int i=0;i<length;i++) {
			boolean swap=false;
			for(int j=length-1;j>i;j--) {
				if(array[j]<array[j-1]) {
					SortUtil.swap(array, j, j-1);
				    swap=true;
				}
			}
			Logger.debug("冒泡排序,趟数{},{}",i+1,Arrays.toString(array));
		    if(!swap) break;
		}
		Logger.info("冒泡排序结果:{}",Arrays.toString(array));
	}
	

}
