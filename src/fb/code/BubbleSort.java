package fb.code;

import fb.utils.RandomFactory;

/********************************
* 概述: 冒泡排序（Bubble Sort）
* 详解: 冒泡排序（Bubble Sort）及其改进
* 作者: fb-soecode
* 创建时间: 2016年11月1日
********************************/
public class BubbleSort {
	/**
	 * 介绍：
	 * 冒泡排序是一种简单的排序算法，算法会遍历若干次要排序的数列，比较相邻两个数据的大小
	 * 如果后>前，则交换位置，这样一次遍历后，最大元素到了队伍的末尾
	 * 相同方式进行循环，每一次都会找到并放置好次大于最后一个元素，直到数列有序
	 * 
	 * 图例：http://img.blog.csdn.net/20160916160748389
	 * 时间复杂度：O(N2)。
	 */
	
	public static void bubbleSort_V1(int arr[], int n){

		for(int i = n-1; i > 0; i--){
			
			for(int j = 0; j < i; j++){
				
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		RandomFactory.printSort(arr);
	}
	
	public static void bubbleSort_V2(int arr[], int n){

		
	}
	
	public static void main(String[] args) {
		
		int nums[] = RandomFactory.createRandom(0, 5, 4);
		BubbleSort.bubbleSort_V1(nums, nums.length);
	}
}
//推荐文章：http://www.cnblogs.com/skywang12345/p/3596232.html