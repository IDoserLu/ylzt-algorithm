package com.ylzt.algorithm.selft.sort;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ylzt.algorithm.self.sort.BubbleSort;
import com.ylzt.algorithm.self.sort.InsertSort;
import com.ylzt.algorithm.self.sort.MergeSort;
import com.ylzt.algorithm.self.sort.QuickSort;
import com.ylzt.algorithm.self.sort.SelectSort;
import com.ylzt.algorithm.self.sort.ShellSort;

public class SortTest {
	private static Logger Logger=LoggerFactory.getLogger(SortTest.class);
	private int[] array=new int[] {10,5,7,8,2,1,18,6,4,86,3,101,5,98,26,84,564,21,898,4,10};
	
	@Before
	public void setUp() {
		Logger.info("排序数组:{}",Arrays.toString(array));
	}
	
	@Test
	public void BubbleSortTest() {
	   BubbleSort.sort(array);
	}
	
	@Test
	public void InsertSortTest() {
		InsertSort.sort(array);
	}
	
	@Test
	public void SelectSortTest() {
		SelectSort.sort(array);
	}
	
	@Test
	public void ShellSortTest() {
		ShellSort.sort(array);
	}
	
	@Test
	public void QuickSortTest() {
		QuickSort.sort(array);
	}
	
	@Test
	public void MergeSortTest() {
		MergeSort.sort(array);
	}
	

}
