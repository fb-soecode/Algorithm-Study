package fb.code;

import java.util.Arrays;

import fb.utils.RandomFactory;

/********************************
* ����: �鲢����(Merge Sort)
* ���: �鲢����(Merge Sort)����Ľ�
* ����: fb-soecode
* ����ʱ��: 2016��11��1�� 
********************************/
public class MergeSort {
	/**
	 * ���ܣ�
	 * �鲢�������õݹ�˼������н�������
	 * 
	 * �� �ֽ� -- ����ǰ����һ��Ϊ����������ѵ� mid = (low + high)/2; 
	 * �� ��� -- �ݹ�ض�����������a[low...mid] �� a[mid+1...high]���й鲢���򡣵ݹ���ս������������䳤��Ϊ1��
	 * �� �ϲ� -- �������������������a[low...mid]�� a[mid+1...high]�鲢Ϊһ�����������a[low...high]��
	 * 
	 * ͼ����http://img.blog.csdn.net/20160917001326254
	 * ʱ�临�Ӷȣ�O(NlgN)��
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
//�Ƽ����£�http://www.cnblogs.com/skywang12345/p/3602369.html
