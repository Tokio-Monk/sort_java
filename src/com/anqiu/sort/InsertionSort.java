package com.anqiu.sort;

import com.anqiu.service.ExcuteSortService;

/**
 * @Title: 插入排序
 * @author: anqiu
 * @date 2018年8月11日
 */
public class InsertionSort implements ExcuteSortService{

	//直接插入排序
	public int[] excute(int[] array) {
		int len = array.length;
		for(int i = 1; i < len; i++){//从第一个元素开始
			int temp = array[i];//存下该位置的值
			int j = i - 1;
			while(j >= 0 && array[j] > temp){//插入已经排好序的左边的数组中
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = temp;
		}
		return array;
	}

}
