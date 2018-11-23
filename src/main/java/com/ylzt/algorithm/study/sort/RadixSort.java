package com.ylzt.algorithm.study.sort;

import java.util.Arrays;

/**
 * 基数排序
 * @author Administrator
 *时间复杂度O(n*m) n:趟数/位数，m：m个数
 */

public class RadixSort {
	
    public static void main(String[] args) {
        int arr[] = {179,2,208,306,93,859,15,984,271,33};
        sort(arr);
        System.out.println("排序后："+Arrays.toString(arr));
    }
    public static void sort(int[] arr) {
        int max = getMax(arr);    // 数组中的最大值,确定最高位是哪一位
        // 从个位开始，对数组进行排序	假设个位：exp=1；十位：exp=10；百位：exp=100.......
        for (int exp = 1; max/exp > 1; exp *= 10){
            countSort(arr, exp);
            System.out.println(exp+"位："+Arrays.toString(arr));
        }
    }
    /*
     * 获取数组最大值
     */
    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
        	if (arr[i] > max){
        		max = arr[i];
        	}
        }
        return max;
    }
    /*
     * 对个位数/十位数/百位数...进行桶排序
     */
    private static void countSort(int[] arr, int exp) {
        int[] temp = new int[arr.length];    // 存储"被排序数据"的临时数组
        //长度为10的数组，初始化buckets[0]~buckets[9]=0;表示从0-9出现的次数为0
        int[] buckets = new int[10];
        //将数据出现的次数存储在buckets[]中
        for (int i = 0; i < arr.length; i++){
            buckets[ (arr[i]/exp)%10 ] ++;
        }
        //找到要排序数组的下标与次数之间的联系
        for (int i = 1; i < 10; i++){
            buckets[i] += buckets[i - 1];
        }
        // 将数据存储到临时数组temp[]中
        for (int i = arr.length - 1; i >= 0; i--) {
        	temp[buckets[ (arr[i]/exp)%10 ] - 1] = arr[i];
            buckets[ (arr[i]/exp)%10 ]--;
        }
        // 将排序好的数据赋值给原数组arr[]
        for (int i = 0; i < arr.length; i++){
            arr[i] = temp[i];
        }
        temp = null;
        buckets = null;
    }
    
    
    
}