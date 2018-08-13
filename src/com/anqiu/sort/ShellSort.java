package com.anqiu.sort;

import com.anqiu.service.ExcuteSortService;
import com.anqiu.util.Swap;

/**
 * @Title: 希尔排序
 * @author: anqiu
 * @date 2018年8月13日
 */
public class ShellSort implements ExcuteSortService{

	//希尔排序
	public int[] excute(int[] array) {
		//增量
        int incrementNum = array.length/2;
        while(incrementNum >= 1){
            for(int i = 0; i < array.length; i++){
                //进行插入排序
                for(int j = i; j < array.length - incrementNum; j = j + incrementNum){
                    if(array[j] > array[j+incrementNum]){
                        Swap.swapTwo(array, j, j+incrementNum);
                    }
                }
            }
            //设置新的增量
            incrementNum = incrementNum/2;
        }
		return array;
	}
	
}
