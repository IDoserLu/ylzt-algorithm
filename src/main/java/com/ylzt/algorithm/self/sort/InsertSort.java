package com.ylzt.algorithm.self.sort;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 插入排序
 * 时间复杂度：O(n^2)
 * 原地排序
 * 稳定排序
 * @author Administrator
 *
 */
public class InsertSort {
	private static Logger Logger=LoggerFactory.getLogger(InsertSort.class);

	/**
	 * 5 7 6 1 8 4
	 * 
	 * 
	 * 标准插入排序
	 * 思路：取当前元素与已排好序的元素进行比较移动插入
	 * @param array
	 */
	public static void sort(int[] array) {
		int length=array.length;
		for(int i=0;i<length;i++) {
			int current=array[i];
			int j=i-1;
			for(;j>=0;j--) {
			  	if(current<array[j]) {
			  		array[j+1]=array[j];
			  	}else{
			  		break;
			  	}
			}
			array[j+1]=current;//该步骤给插入点位置赋值，可从首位，末尾，中间分析
			Logger.debug("插入排序,趟数{},{}",i+1,Arrays.toString(array));
		}
		  Logger.info("插入排序结果:{}",Arrays.toString(array));
		
	
	}
	
	  /**
     * 5 7 6 1 8 4
     * 第一趟 5 7 6 1 8 4
     * 第二趟 5 7 6 1 8 4
     * 第三趟 5 6 7 1 8 4
     * 第四趟 1 5 6 7 8 4
     * 第五趟 1 4 5 6 7 8
     * 思路 从后往前相邻元素进行比较移动
     * 类似冒泡算法
     * @param array
     */
	public static void sort1(int[] array) {
		int length=array.length;
		for(int i=0;i<length;i++) {
			for(int j=i-1;j>=0;j--) {
				if(array[j]>array[j+1]) {
					SortUtil.swap(array, j, j+1);
				}
			}
		Logger.debug("插入排序,趟数{},{}",i+1,Arrays.toString(array));
		}
	  Logger.info("插入排序结果:{}",Arrays.toString(array));
	}
	
}
