package com;

public class InsertionSort {
	
	static long countComparision = 0;
	
	public void insertionSort(int arr[], int low, int high){
		int temp;
		for (int i = low+1; i <= high; i++) {
			temp = arr[i];
			int j;
			for(j = i - 1 ; j >= low && temp < arr[j] ; j--){
				++countComparision;
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = temp;
		}
	}

}
