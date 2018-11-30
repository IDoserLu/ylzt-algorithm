package com.ylzt.algorithm.self.sort;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 希尔排序
 * 时间复杂度 O(n^1.3)
 * 原地排序
 * 不稳定排序
 * @author Administrator
 *
 */
public class ShellSort {
	private static Logger Logger=LoggerFactory.getLogger(ShellSort.class);
	/**
	 * 
	 * 
	 * 5 6 4 8 3 6 1 9 7 2
	 * {5,6} {6,1} {4,9} {8,7} {3,2}
	 * 5,6,1,6,4,9,7,8,2,3
	 * {5,1,4,7,2} {6,6,9,8,3}
	 * 1,2,4,5,7,3,6,6,8,9
	 * 
	 * 1,2,3,4,5,7,6,6,8,9
	 * 1,2,3,4,5,6,7,6,8,9
	 * 1,2,3,4,5,6,6,7,8,9
	 * https://blog.csdn.net/collonn/article/details/19814193
	 * 
	 * 
	 * @param array
	 */
   public static void sort(int[] array) {
	   int length=array.length;
	   int step=length/2;
	  while(step>=1) {
		  for(int i=0;i<length;i=i+step) { 
			int current=array[i];
			int j=i-step;
		    for(;j>=0;j=j-step) {
			  if(current< array[j]){
				   array[j+step]=array[j];
			   }else {
				   break;
			   }
		    }
		    array[j+step]=current;
		  }
	   Logger.debug("希尔排序,步长{},{}",step,Arrays.toString(array));
		  step=step/2;
	 }
		Logger.info("希尔排序结果:{}",Arrays.toString(array));
   }
}
