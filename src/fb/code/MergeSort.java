package fb.code;

import java.util.Arrays;

import fb.utils.RandomFactory;

/********************************
* 概述: 归并排序(Merge Sort)
* 详解: 归并排序(Merge Sort)及其改进
* 作者: fb-soecode
* 创建时间: 2016年11月1日 
********************************/
public class MergeSort {
	/**
	 * 介绍：
	 * 归并排序利用递归思想对数列进行排序
	 * 
	 * ① 分解 -- 将当前区间一分为二，即求分裂点 mid = (low + high)/2; 
	 * ② 求解 -- 递归地对两个子区间a[low...mid] 和 a[mid+1...high]进行归并排序。递归的终结条件是子区间长度为1。
	 * ③ 合并 -- 将已排序的两个子区间a[low...mid]和 a[mid+1...high]归并为一个有序的区间a[low...high]。
	 * 
	 * 图例：http://img.blog.csdn.net/20160917001326254
	 * 时间复杂度：O(NlgN)。
	 */
	public static void mergeSotr(int arr[], int start, int end){
		
		if(arr == null || start >= end)
			return;
		int mid = (start+end) / 2;
		
		mergeSotr(arr, start, mid);
		
		mergeSotr(arr, mid+1, end);
		
		merge(arr, start, mid, end);
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		
		int[] temp = new int[end - start + 1];
		int i = start;
		int j = mid + 1;
		int k = 0;
		
		while(i <= mid && j <= end){
			if(arr[i] <= arr[j])
				temp[k++] = arr[i++];
			else
				temp[k++] = arr[j++];
		}
		
		while( i <= mid)
			temp[k++] = arr[i++];
		
		while( j <= end)
			temp[k++] = arr[j++];
		
		
		for(i = 0; i < temp.length; i++)
			arr[start+i] = temp[i];
		
		System.out.println("merge: " +Arrays.toString(temp));
		System.out.println("merge:-arr " +Arrays.toString(arr));
		temp = null;
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = RandomFactory.createRandom(0, 20, 6);
		MergeSort.mergeSotr(arr, 0, arr.length-1);
		RandomFactory.printSort(arr);
	}
}
//推荐文章：http://www.cnblogs.com/skywang12345/p/3602369.html
