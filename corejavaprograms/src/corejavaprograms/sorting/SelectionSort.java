package corejavaprograms.sorting;

import java.util.Arrays;

public class SelectionSort {
	
	// Time Complexity o(n^2)
	public static void selectionSort(int arr[]) {
		
		for(int i=0;i<arr.length-1;i++) {
			int smallest=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[smallest]>arr[j]) {
					smallest=j;
				}
			}
			int temp=arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
		}
		
	}

	public static void main(String[] args) {
		int arr[]= {7,8,3,1,2};
		
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));

	}
}
