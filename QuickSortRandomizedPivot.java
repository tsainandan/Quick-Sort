package com;

import java.util.Random;

public class QuickSortRandomizedPivot {

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
	 
	public void randomizedPivotQuicksort(int arr[], int low, int high){
		if(low < high){
			int partition = randomizedPartition(arr, low, high);
			randomizedPivotQuicksort(arr, low, partition-1);
			randomizedPivotQuicksort(arr, partition+1, high);
		}
	}
	
	public int randomizedPartition(int arr[], int low, int high){
		Random rand = new Random();
		int num = low + rand.nextInt(high - low);
		int temp = arr[high];
		arr[high] = arr[num];
		arr[num] = temp;
		return partition(arr, low, high);
		
	}
}
