package com.anqiu.sort;

import com.anqiu.service.ExcuteSortService;
import com.anqiu.util.Swap;

/**
 * @Title: 选择排序
 * @author: anqiu
 * @date 2018年8月13日
 */
public class SelectionSort implements ExcuteSortService{

	/**
	 * 选择排序
	 */
	public int[] excute(int[] array) {
		int len = array.length;
		for(int i = 0; i < len - 1; i++){
			int min = i;
			for(int j = i+1; j < len; j++){
				if(array[j] < array[min]){
					min = j;
				}
			}
			Swap.swapTwo(array, min, i);
		}
		return array;
	}

}
