package fb.code;

import fb.utils.RandomFactory;
import sun.management.counter.Variability;

/********************************
* 概述: 直接插入排序(Straight Insertion Sort)
* 详解: 直接插入排序(Straight Insertion Sort)及其优化
* 作者: fb-soecode
* 创建时间: 2016年11月1日
********************************/
public class InsertSort {
	
	/**
	 * 介绍：
	 * 直接插入排序是一种简单排序，通过构建有序序列，对于未排序数列，在以排序序列中从后向前扫描，
	 * 插入到该元素合适的位置上，以此类推，直到未排序数列排序完成。
	 * 
	 * 图例：http://img.blog.csdn.net/20160916173802597
	 * 时间复杂度：O(N2)。
	 */
	// 4 2 5 1
	public static void insertSort(int[] arr, int n){
		
		//arr[]数组，其中i表示未排序数列的循环中，首元素的索引
		for(int i = 1; i < n; i++){
			
			int key = arr[i];
			
			int j = i-1;
			
			while(j >= 0 && arr[j] > key){
				
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		RandomFactory.printSort(arr);
	}
	
	public static void main(String[] args) {
		
		int arr[] = RandomFactory.createRandom(0, 5, 4);
		InsertSort.insertSort(arr, arr.length);
	}
}
//推荐文章：http://www.cnblogs.com/skywang12345/p/3596881.html
//http://blog.csdn.net/u013063153/article/details/52667542
