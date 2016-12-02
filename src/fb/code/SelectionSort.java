package fb.code;

import fb.utils.RandomFactory;

/********************************
* ����: ѡ������(Selection sort)
* ���: ѡ������(Selection sort)����Ľ�
* ����: fb-soecode
* ����ʱ��: 2016��11��1�� 
********************************/
public class SelectionSort {
	/**
	 * ���ܣ�
	 * ѡ������(Selection sort)��һ�ּ�ֱ�۵������㷨.
	 * ����˼·Ϊ�����������ҳ�������С��Ԫ�ط��õ���һλ��
	 * Ȼ���δ������������ҵ�������С��Ԫ�طŵ����������еĶ�β��ֱ�����б���������
	 * 
	 * ͼ����http://img.blog.csdn.net/20160916164754013
	 * ʱ�临�Ӷȣ�O(N2)��
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
//�Ƽ����£�http://www.cnblogs.com/skywang12345/p/3597641.html
