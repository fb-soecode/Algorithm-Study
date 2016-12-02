package fb.code;

import fb.utils.RandomFactory;

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
			
			//arr[]���飬����j��ʾ�����������У�ĩβԪ�ص�����
			for(int j = i-1; j >= 0; j--){
				
				if(arr[j] < arr[i])
					break;
				
				//i = j ��ʱ����Ҫ���н������� i = 1, j = 0
				if(j != i-1){
					
					int temp = arr[i];
					for(int k = i-1; k >= j; k--){
						arr[k+1] = arr[k];
						arr[k+1] = temp;
					}
				}
			}
		}
		RandomFactory.printSort(arr);
	}
	
	public static void main(String[] args) {
		
		int arr[] = RandomFactory.createRandom(0, 5, 4);
		InsertSort.insertSort(arr, arr.length);
	}
}
//�Ƽ����£�http://www.cnblogs.com/skywang12345/p/3596881.html
