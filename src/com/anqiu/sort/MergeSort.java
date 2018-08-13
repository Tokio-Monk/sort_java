package com.anqiu.sort;

import com.anqiu.service.ExcuteSortParamService;

/**
 * @Title: 归并排序
 * @author: anqiu
 * @date 2018年8月11日
 */
public class MergeSort implements ExcuteSortParamService{

	/**
	 * 归并排序
	 */
	public int[] excute(int[] array, int low, int high) {
		int mid = (low+high)/2;
        if(low<high){
        	excute(array,low,mid);
        	excute(array,mid+1,high);
            //左右归并
            merge(array,low,mid,high);
        }
        return array;
	}
	
	 public void merge(int[] a, int low, int mid, int high) {
        int[] temp = new int[high-low+1];
        int i= low;
        int j = mid+1;
        int k=0;
        // 把较小的数先移到新数组中
        while(i<=mid && j<=high){
            if(a[i]<=a[j]){
                temp[k++] = a[i++];
            }else{
                temp[k++] = a[j++];
            }
        }
        // 把左边剩余的数移入数组 
        while(i<=mid){
            temp[k++] = a[i++];
        }
        // 把右边边剩余的数移入数组
        while(j<=high){
            temp[k++] = a[j++];
        }
        // 把新数组中的数覆盖nums数组
        for(int x=0;x<temp.length;x++){
            a[x+low] = temp[x];
        }
    }
}
