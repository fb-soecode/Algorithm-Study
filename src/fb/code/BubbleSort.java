package fb.code;

import fb.utils.RandomFactory;

/********************************
* ����: ð������Bubble Sort��
* ���: ð������Bubble Sort������Ľ�
* ����: fb-soecode
* ����ʱ��: 2016��11��1��
********************************/
public class BubbleSort {
	/**
	 * ���ܣ�
	 * ð��������һ�ּ򵥵������㷨���㷨��������ɴ�Ҫ��������У��Ƚ������������ݵĴ�С
	 * �����>ǰ���򽻻�λ�ã�����һ�α��������Ԫ�ص��˶����ĩβ
	 * ��ͬ��ʽ����ѭ����ÿһ�ζ����ҵ������úôδ������һ��Ԫ�أ�ֱ����������
	 * 
	 * ͼ����http://img.blog.csdn.net/20160916160748389
	 * ʱ�临�Ӷȣ�O(N2)��
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
//�Ƽ����£�http://www.cnblogs.com/skywang12345/p/3596232.html