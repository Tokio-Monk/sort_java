package com.anqiu.util;

public class Swap {
	
	//交换两个位置的值
	public static void swapTwo(int[] array, int index_a, int index_b){
		int temp;
		temp = array[index_a];
		array[index_a] = array[index_b];
		array[index_b] = temp;
	}
}
