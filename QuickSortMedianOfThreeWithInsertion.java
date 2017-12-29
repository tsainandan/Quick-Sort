package com;

public class QuickSortMedianOfThreeWithInsertion {

	static long countComparision = 0;
	static long countComparisionInsertion = 0;

	public int partition(int arr[], int low, int high){
		median(arr,low,high);
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
			if ((high - low) <= 9)
			{
				insertionSort(arr, low, high);
			}
			else{
				int partition = partition(arr, low, high);
				quicksort(arr, low, partition-1);
				quicksort(arr, partition+1, high);
			}
		}
	}

	public void median(int arr[],int low, int high){

		int center = (low + high)/2;
		int temp = 0;

		if (arr[low] > arr[center]){
			//++countComparision;
			temp = arr[low];
			arr[low] = arr[center];
			arr[center] = temp;
		}
		if (arr[low] > arr[high]){
			//countComparision = countComparision + 1;
			temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
		}
		if (arr[center] > arr[high]){
			//countComparision = countComparision + 2;
			temp = arr[center];
			arr[center] = arr[high];
			arr[high] = temp;
		}

		temp = arr[center];
		arr[center] = arr[high];
		arr[high] = temp;
	}
	
	public void insertionSort(int arr[], int low, int high){
		int temp;
		for (int i = low+1; i <= high; i++) {
			temp = arr[i];
			int j;
			for(j = i - 1 ; j >= low && temp < arr[j] ; j--){
				++countComparisionInsertion;
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = temp;
		}
	}

}
