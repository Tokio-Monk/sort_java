package com.anqiu.sort;

import com.anqiu.service.ExcuteSortParamService;
import com.anqiu.util.Swap;

/**
 * @Title: 快速排序
 * @author: anqiu
 * @date 2018年8月11日
 */
public class QuickSort implements ExcuteSortParamService{

	//快速排序
	public int[] excute(int[] array, int left, int right) {
		if(left > right){//退出递归
			return array;
		}
		int p = array[left];
		int i = left;
		int j = right;
		while(i < j){
			while(p <= array[j] && i < j){//从右往左找比基准值小的数
				j--;
			}
		    while(p >= array[i] && i < j){//从左往右找比基准值大的数
		    	i++;
		    }
		    if(i < j){ //如果i<j，交换它们
		    	Swap.swapTwo(array, i, j);
		    }
		          
		}
		array[left] = array[i];
		array[i] = p;//把基准值放到合适的位置
		excute(array,left,i - 1);//对左边的子数组进行快速排序
		excute(array,i + 1,right);//对右边的子数组进行快速排序
		return array;
	}

}
