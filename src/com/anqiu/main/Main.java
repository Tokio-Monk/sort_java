package com.anqiu.main;

import java.util.Arrays;

import com.anqiu.service.ExcuteSortService;
import com.anqiu.sort.ShellSort;

/**
 * @Title: 执行排序
 * @author: anqiu
 * @date 2018年8月9日
 */
public class Main {
	public static void main(String[] args) {
		int array[] = {89,45,68,90,29,34,17,67};
		
		//冒泡排序
		/*long startTime = System.currentTimeMillis();   //获取开始时间
		ExcuteSortService bubbleSort = new BubbleSort();
		array = bubbleSort.excute(array);
		long endTime = System.currentTimeMillis(); //获取结束时间
		System.out.println("程序运行时间： "+(endTime - startTime)+"ms");
		System.out.println(Arrays.toString(array));*/
		
		//选择排序
		/*long startTime = System.currentTimeMillis();   //获取开始时间
		ExcuteSortService selectionSort = new SelectionSort();
		array = selectionSort.excute(array);
		long endTime = System.currentTimeMillis(); //获取结束时间
		System.out.println("程序运行时间： "+(endTime - startTime)+"ms");
		System.out.println(Arrays.toString(array));*/
		
		//归并排序
		/*long startTime = System.currentTimeMillis();   //获取开始时间
		ExcuteSortParamService mergeSort = new MergeSort();
		array = mergeSort.excute(array,0,array.length-1);
		long endTime = System.currentTimeMillis(); //获取结束时间
		System.out.println("程序运行时间： "+(endTime - startTime)+"ms");
		System.out.println(Arrays.toString(array));*/
		
		//快速排序
		/*long startTime = System.currentTimeMillis();   //获取开始时间
		ExcuteSortParamService quickSort = new QuickSort();
		array = quickSort.excute(array,0,array.length-1);
		long endTime = System.currentTimeMillis(); //获取结束时间
		System.out.println("程序运行时间： "+(endTime - startTime)+"ms");
		System.out.println(Arrays.toString(array));*/
		
		//直接插入排序
		/*long startTime = System.currentTimeMillis();   //获取开始时间
		ExcuteSortService insertionSort = new InsertionSort();
		array = insertionSort.excute(array);
		long endTime = System.currentTimeMillis(); //获取结束时间
		System.out.println("程序运行时间： "+(endTime - startTime)+"ms");
		System.out.println(Arrays.toString(array));*/
		
		//希尔排序
		long startTime = System.currentTimeMillis();   //获取开始时间
		ExcuteSortService shellSort = new ShellSort();
		array = shellSort.excute(array);
		long endTime = System.currentTimeMillis(); //获取结束时间
		System.out.println("程序运行时间： "+(endTime - startTime)+"ms");
		System.out.println(Arrays.toString(array));
	}
}
