package fb.utils;

import java.util.Arrays;
import java.util.Date;

/********************************
* ����: ���ڲ����涨��С�������
* ���: ���ڲ����涨��С�������
* ����: fb-soecode
* ����ʱ��: 2016��11��1�� 3 
********************************/
public class RandomFactory {
	
	/**
	 * ����������飬��������
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
