package com.ylzt.algorithm.self.sort;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 快速排序
 * 时间复杂度：O(nlogn)
 * 原地排序
 * 不稳定排序
 * @author Administrator
 *
 */
public class QuickSort {
  private static Logger Logger=LoggerFactory.getLogger(QuickSort.class);

	/**
	 * 8 6 4 3 7 4 15 9
	 *       
	 * 6 4 3 7 4 8 15 9
	 * 
	 * 4 3 4 6 7 8 9 15
	 * 
	 * 3 4 4 6 7 8 9 15
	 * 
	 *核心思想寻找分区点，递归排序左半部和右半部的数据
	 * @param array
	 */
	public static void sort(int[] array) {
		sortPart(array,0,array.length-1);
		  Logger.info("快速排序结果:{}",Arrays.toString(array));
	}
	
	/**
	 * 分区点在首位算法
	 * 最后一步交换（头部交换）
	 *   i     j
	 * 6 8  7  2
	 * 6 2  8  7
	 *      8
	 * 2 6  8 7    i
	 * @param array
	 * @param start
	 * @param end
	 */
	public static void sortPart(int[] array,int start,int end) {
		if(start>=end) return; //递归终止条件
		int i=start;//已排序指针 代表分区点指针
		int j=start;//未排序指针
		int partition=array[start];
		for(;j<=end;j++) {
			if(array[j]<=partition) {//关键条件
				SortUtil.swap(array, i, j);
				i++;
			}
		}
		i=i-1;
		SortUtil.swap(array, start, i);	
		Logger.debug("快速排序结果:{}",Arrays.toString(array));
	    sortPart(array,start,i-1);//左半部分排序
	    sortPart(array,i+1,end);//右半部分排序
	}
	
	/**
	 * 分区点在首位算法
	 * @param array
	 * @param start
	 * @param end
	 */
	public static void sortPart1(int[] array,int start,int end) {
		if(start>=end) return; //递归终止条件
		int i=start+1;//已排序指针 代表分区点指针
		int j=start+1;//未排序指针
		int partition=array[start];
		for(;j<=end;j++) {
			if(array[j]<=partition) {//关键条件
				SortUtil.swap(array, i, j);
				i++;
			}
		}
		i=i-1;
		SortUtil.swap(array, start, i);	
		Logger.debug("快速排序结果:{}",Arrays.toString(array));
	    sortPart(array,start,i-1);//左半部分排序
	    sortPart(array,i+1,end);//右半部分排序
	}
	
	
	
	/**
	 * 建议写法
	 * 分区点在末尾算法
	 * 最后一步交换（尾交换）
	 * 
	 * @param array
	 */
	public static void sortPart2(int[] array,int start,int end) {
		if(start>=end) return;//递归终止条件
		int i=start;//代表分区点指针
		int j=start;
		int partition=array[end];
		for(;j<end;j++) {
			if(array[j]<=partition) {
				SortUtil.swap(array, i, j);
				i++;
			}
		}
		SortUtil.swap(array, i,end);	
		Logger.debug("快速排序结果:{}",Arrays.toString(array));
	    sortPart(array,start,i-1);//左半部分排序
	    sortPart(array,i+1,end);//右半部分排序
		
	}
	
	/**
	 * 5 9 7 5 8 9
	 * 声明左右指针，分别指向数据左端和右端
	 * 分区点在首位
	 * 某一轮循环后最后一步谁先走
	 * 最后一步7  6  9
	 * @param array
	 * @param start
	 * @param end
	 */
	public static void sortPart3(int array[],int start,int end) {
		if(start>=end) return;//递归终止条件
		int left=start;
		int right=end;
		int partition=array[start];
		while(left!=right) {//左右指针相逢，条件终止
			while(array[left]<=partition&&left!=right) {
				left++;
			}
			
			while(array[right]>=partition&&left!=right) {
				right--;
			}
		
			SortUtil.swap(array, left,right);//找到不满足的条件交换
		}
		left=left-1;
		SortUtil.swap(array, start,left);
		Logger.debug("快速排序结果:{}",Arrays.toString(array));
		sortPart(array,start,left-1);//左半部分排序
		sortPart(array,left+1,end);//右半部分排序
	}
	
	/**
	 * 5 9 7 5 8 9
	 * 
	 * 
	 * 声明左右指针，分别指向数据左端和右端
	 * 分区点在首位
	 * @param array
	 * @param start
	 * @param end
	 */
	public static void sortPart4(int array[],int start,int end) {
		if(start>=end) return;//递归终止条件
		int left=start;
		int right=end;
		int partition=array[start];
		while(left!=right) {//左右指针相逢，条件终止
		
			while(array[right]>=partition&&left!=right) {
				right--;
			}
			
			while(array[left]<=partition&&left!=right) {
				left++;
			}
			SortUtil.swap(array, left,right);//找到不满足的条件交换
		}
		SortUtil.swap(array, start,left);
		Logger.debug("快速排序结果:{}",Arrays.toString(array));
		sortPart(array,start,left-1);//左半部分排序
		sortPart(array,left+1,end);//右半部分排序
	}

}
