package com.anqiu.sort;

import com.anqiu.service.ExcuteSortService;
import com.anqiu.util.Swap;

/**
 * @Title: 冒泡排序
 * @author: anqiu
 * @date 2018年8月9日
 */
public class BubbleSort implements ExcuteSortService{

	//执行排序
	public int[] excute(int[] array) {
		int len = array.length;
		for(int i = 0; i < len - 1; i++){
			for(int j = 0; j < len - 1 - i; j++){
				if(array[j] > array[j+1]){
					Swap.swapTwo(array, j, j+1);
				}
			}
		}
		return array;
	}
	
}
