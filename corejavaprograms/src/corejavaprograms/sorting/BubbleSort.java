package corejavaprograms.sorting;

import java.util.Arrays;

public class BubbleSort {
	
public static void printArray(int arr[]) {
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

    public static void main(String[] args) {
     int arr[]={ -6 ,5 ,3 , 1, 8 ,7, -2, 4 };
     printArray(arr);
     System.out.println(Arrays.toString(arr));
	}
}
