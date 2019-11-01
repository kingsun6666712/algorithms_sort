package main.java.algorithms.sort;

public class InsertSort {

	public int[] insert(int[] arr) {
		
		int length=arr.length;
		int insertNum;
		for(int i=1;i<=length;i++) {
			insertNum=arr[i];
			int j = i-1;
			while(j>=0&&arr[j]>insertNum) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[i+1]=insertNum;
		}
		return arr;
	}
}
