package com.ylzt.algorithm.self.sort;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 归并排序
 * 时间复杂度：O(nlogn)
 * 原地排序
 * 稳定排序
 * @author Administrator
 *
 */
public class MergeSort {
	private static Logger Logger=LoggerFactory.getLogger(MergeSort.class);

    /**
     * 先分解后合并
     * @param args
     */
	public static void sort(int[] array) {
		mergeSort(array,0,array.length-1);
		Logger.info("归并排序结果:{}",Arrays.toString(array));
	}
	
	/**
	 * 5 6 8 3 7 9
	 * 
	 * 
	 * 
	 * @param array
	 * @param start
	 * @param end
	 */
	private static void mergeSort(int[] array,int start,int end) {
		 if(start>=end) return; 
		 int middle=(start+end)/2;
		 /*********递归分解***********/
		 mergeSort(array,start,middle);
		 mergeSort(array,middle+1,end);
		/*******合并算法**********/
		int temp[]=new int[end-start+1];
		int i=start,k=middle+1,idx=0;
		while(i<=middle&&k<=end) {
			if(array[i]<=array[k]) {
				temp[idx++]=array[i++];
			}else {
				temp[idx++]=array[k++];
			}
		}
		/******左或右剩余数组中的元素copy***********/
		int s=i,e=middle;
	    if(k<=end) {s=k;e=end;}
		for(;s<=e;s++) {
			temp[idx++]=array[s];
		}
		/******数组copy******/
		for(int m=0;m<=end-start;m++) {
			array[start+m]=temp[m];
		}
	}
	
	
	
}
