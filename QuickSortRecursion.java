package com;

public class QuickSortRecursion {

	static long countComparision = 0;
	
	public int partition(int arr[], int low, int high){
		int pivot = arr[high];
		int i = (low-1);
		for(int j = low; j<=high-1; j++){
			++countComparision;
			if(arr[j]<=pivot){
				i++;
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;
	}
	 
	public void quicksort(int arr[], int low, int high){
		if(low < high){
			int partition = partition(arr, low, high);
			quicksort(arr, low, partition-1);
			quicksort(arr, partition+1, high);
		}
	}
}
