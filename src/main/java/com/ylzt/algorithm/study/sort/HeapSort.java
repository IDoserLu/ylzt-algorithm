package com.ylzt.algorithm.study.sort;


import java.util.Arrays;
/**
 * 堆排序
 * @author Administrator
 *时间复杂度O(nlogn)
 */
public class HeapSort {
    public static void main(String []args){
        int[] arr = {46,58,15,45,90,18,10,62};
        sort(arr);
        System.out.println("排序后："+Arrays.toString(arr));
    }
    public static void sort(int []arr){
        //1.构建大顶堆,从第一个非叶子结点从下至上，从右到左调整结构
        for(int i = arr.length/2-1; i >= 0; i--){
            adjustHeap(arr,i,arr.length);
        }
        //2.将堆顶元素和末尾元素进行交换，继续调整为大顶堆
        for(int j = arr.length-1; j > 0; j--){
        	swap(arr,0,j);//将堆顶元素与末尾元素进行交换
            adjustHeap(arr,0,j);//重新对堆进行调整
        }

    }
    /**
     * 调整大顶堆
     * @param arr
     * @param i
     * @param length
     */
    public static void adjustHeap(int []arr,int i,int length){
        int temp = arr[i];//先取出当前元素i
        for(int k = i*2+1; k < length; k=k*2+1){//从i结点的左孩子(2*i+1)开始
            if(k+1 < length && arr[k] < arr[k+1]){//如果右孩子大于左孩子，k指向右孩子
                k = k+1;
            }
            if(arr[k] > temp){//如果子节点大于父节点，将子节点值赋给父节点
                arr[i] = arr[k];
                i = k;
            }else{
                break;
            }
        }
        arr[i] = temp;
        System.out.println(Arrays.toString(arr));
    }
    /**
     * 交换元素
     * @param arr
     * @param a
     * @param b
     */
    public static void swap(int []arr,int a ,int b){
        int temp=arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}