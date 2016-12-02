package fb.code;

import fb.utils.RandomFactory;

/********************************
* 概述: 选择排序(Selection sort)
* 详解: 选择排序(Selection sort)及其改进
* 作者: fb-soecode
* 创建时间: 2016年11月1日 
********************************/
public class SelectionSort {
	/**
	 * 介绍：
	 * 选择排序(Selection sort)是一种简单直观的排序算法.
	 * 基本思路为，从数列中找出最大或最小的元素放置到第一位，
	 * 然后从未排序的数列中找到最大或最小的元素放到已排序序列的队尾，直至数列遍历结束。
	 * 
	 * 图例：http://img.blog.csdn.net/20160916164754013
	 * 时间复杂度：O(N2)。
	 */
	
	public static void selectionSort(int arr[], int n){

		for(int i = 0; i < n; i++){
			
			int min = i;
			
			for(int j = i+1; j < n; j++){
				
				if(arr[j] < arr[min])
					min = j;
			}
			
			if(min != i){
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
		RandomFactory.printSort(arr);
	}
	
	public static void main(String[] args) {
		
		int arr[] = RandomFactory.createRandom(0, 5, 10);
		SelectionSort.selectionSort(arr, arr.length);
	}
}
//推荐文章：http://www.cnblogs.com/skywang12345/p/3597641.html
