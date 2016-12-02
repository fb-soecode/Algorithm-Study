package fb.utils;

import java.util.Arrays;
import java.util.Date;

/********************************
* 概述: 用于产生规定大小的随机数
* 详解: 用于产生规定大小的随机数
* 作者: fb-soecode
* 创建时间: 2016年11月1日 3 
********************************/
public class RandomFactory {
	
	/**
	 * 生产随机数组，用作排序
	 * @param min
	 * @param max
	 * @param size
	 * @return
	 */
	public static int[] createRandom(int min,int max,int size){
		
		int temp[] = new int[size];
		for(int i = 0; i < size; i++){
			temp[i] =  (int)(min + Math.random()*(max - min +1));
		}
		System.out.println("createRandom : " + Arrays.toString(temp));
		return temp;
	}
	
	public static void printSort(int arr[]){
		
		System.out.println("sortRandom : " + Arrays.toString(arr));
	}
	
	public static void sortTime(Date start, Date end){
		
		System.out.println("sortTime : " + (end.getTime() - start.getTime()) + "s");
	}
}
