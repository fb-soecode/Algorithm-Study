package fb.code;

import fb.utils.RandomFactory;
import sun.management.counter.Variability;

/********************************
* ����: ֱ�Ӳ�������(Straight Insertion Sort)
* ���: ֱ�Ӳ�������(Straight Insertion Sort)�����Ż�
* ����: fb-soecode
* ����ʱ��: 2016��11��1��
********************************/
public class InsertSort {
	
	/**
	 * ���ܣ�
	 * ֱ�Ӳ���������һ�ּ�����ͨ�������������У�����δ�������У��������������дӺ���ǰɨ�裬
	 * ���뵽��Ԫ�غ��ʵ�λ���ϣ��Դ����ƣ�ֱ��δ��������������ɡ�
	 * 
	 * ͼ����http://img.blog.csdn.net/20160916173802597
	 * ʱ�临�Ӷȣ�O(N2)��
	 */
	// 4 2 5 1
	public static void insertSort(int[] arr, int n){
		
		//arr[]���飬����i��ʾδ�������е�ѭ���У���Ԫ�ص�����
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
//�Ƽ����£�http://www.cnblogs.com/skywang12345/p/3596881.html
//http://blog.csdn.net/u013063153/article/details/52667542
