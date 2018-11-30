package com.ylzt.algorithm.self.sort;
/**
 * 排序工具
 * @author Administrator
 *
 */
public class SortUtil {
    /**
     * 数组元素交换位置
     * @param array
     * @param m 索引位置
     * @param n 索引位置
     */
	public static void swap(int[] array,int m,int n) {
		 int temp=array[m];
		 array[m]=array[n];
		 array[n]=temp;
	}
}
