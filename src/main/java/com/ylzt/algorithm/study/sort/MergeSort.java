package com.ylzt.algorithm.study.sort;
import java.util.Arrays;
/**
 * 归并排序
 * @author Administrator
 *时间复杂度O(nlogn)
 */
public class MergeSort {
    public static void main(String[] args){
        int[] arr = {46,58,15,45,90,18,10,62,78};
        Msort(arr);
        System.out.println("排序后："+Arrays.toString(arr));
    }
    
    public static void Msort(int[] arr){
        int[] temp = new int[arr.length];//在排序前，先建好一个长度等于原数组长度的临时数组，避免递归中频繁开辟空间
        sort(arr,0,arr.length-1,temp);
    }
    
    //时间复杂度logn
    private static void sort(int[] arr,int left,int length,int[] temp){
        if(left < length){
            int mid = (left+length)/2;
            sort(arr,left,mid,temp);//左边归并排序，使得左子序列有序
            sort(arr,mid+1,length,temp);//右边归并排序，使得右子序列有序
            merge(arr,left,mid,length,temp);//将两个有序子数组合并操作
        }
    }
    private static void merge(int[] arr,int left,int mid,int length,int[] temp){
    	int i = left;//左序列指针 0
        int j = mid+1;//右序列指针 1
        int t = 0;//临时数组指针
        while (i <= mid && j <= length){
            if(arr[i] <= arr[j]){
                temp[t] = arr[i];
                t++;
                i++;
            }else{
                temp[t++] = arr[j++];
            }
        }
        
        while(i <= mid){//将左边剩余元素填充进temp中
            temp[t++] = arr[i++];
        }
        while(j <= length){//将右序列剩余元素填充进temp中
            temp[t++] = arr[j++];
        }
        t = 0;
        //将temp中的元素全部拷贝到原数组中
        while(left <= length){
            arr[left++] = temp[t++];
        }
        
    }
    
    
    
}