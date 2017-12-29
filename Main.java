package com;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] unsorted = new int[100000];
		//int[] unsorted = new int[30];
		int unsortedRandomizedPivot[] = new int[unsorted.length];
		int unsortedMedianOfThree[] = new int[unsorted.length];
		int unsortedInsertion[] = new int[unsorted.length];
		int unsortedQuickWithInsertion[] = new int[unsorted.length];
		int unsortedRandomizedPivotWithInsertion[] = new int[unsorted.length];
		int unsortedMedianOfThreeWithInsertion[] = new int[unsorted.length];

		for(int i = 0; i< unsorted.length; i++){
			int n = (int)(Math.random()*100000);
			//int n = (int)(Math.random()*100);
			//System.out.println(n);
			//int n = unsorted.length - i;
			//int n = 100;
			unsorted[i] = n;
			unsortedRandomizedPivot[i] = n;
			unsortedMedianOfThree[i] = n;
			unsortedInsertion[i] = n;
			unsortedQuickWithInsertion[i] = n;
			unsortedRandomizedPivotWithInsertion[i] = n;
			unsortedMedianOfThreeWithInsertion[i] = n;
		}

		/*		for (int i = 0; i < unsorted.length; i++) {
			unsortedRandomizedPivot[i] = unsorted[i];
			unsortedMedianOfThree[i] = unsorted[i];
			unsortedInsertion[i] = unsorted[i];
			unsortedRandomizedPivotWithInsertion[i] = unsorted[i];
			unsortedMedianOfThreeWithInsertion[i] = unsorted[i];
		}
		 */
		/*int unsortedRandomizedPivot[] = unsorted;
		int unsortedMedianOfThree[] = unsorted;
		int unsortedInsertion[] = unsorted;
		int unsortedRandomizedPivotWithInsertion[] = unsorted;
		int unsortedMedianOfThreeWithInsertion[] = unsorted;*/

		System.out.println("Simple Insertion Sort");
		System.out.println("unSorted array : " + Arrays.toString(unsortedInsertion));
		InsertionSort objInsertion = new InsertionSort();
		objInsertion.insertionSort(unsortedInsertion, 0, unsortedInsertion.length-1);
		System.out.println("Sorted array : " + Arrays.toString(unsortedInsertion));
		
		System.out.println("Simple Quicksort");
		System.out.println("unSorted array : " + Arrays.toString(unsorted));
		QuickSortRecursion obj = new QuickSortRecursion();
		obj.quicksort(unsorted, 0, unsorted.length-1);
		System.out.println("Sorted array : " + Arrays.toString(unsorted));

		System.out.println("Quicksort with Randomized pivot");
		System.out.println("unSorted array : " + Arrays.toString(unsortedRandomizedPivot));
		QuickSortRandomizedPivot obj1 = new QuickSortRandomizedPivot();
		obj1.randomizedPivotQuicksort(unsortedRandomizedPivot, 0, unsortedRandomizedPivot.length-1);
		System.out.println("Sorted array : " + Arrays.toString(unsorted));

		System.out.println("Quicksort with Median-of-three pivot");
		System.out.println("unSorted array : " + Arrays.toString(unsortedMedianOfThree));
		QuickSortMedianOfThree obj2 = new QuickSortMedianOfThree();
		obj2.quicksort(unsortedMedianOfThree, 0, unsortedMedianOfThree.length-1);
		System.out.println("Sorted array : " + Arrays.toString(unsorted));

		System.out.println("Quicksort with Insertion Sort");
		System.out.println("unSorted array : " + Arrays.toString(unsortedQuickWithInsertion));
		QuickSortWithInsertion obj3 = new QuickSortWithInsertion();
		obj3.quicksort(unsortedQuickWithInsertion, 0, unsortedQuickWithInsertion.length-1);
		System.out.println("Sorted array : " + Arrays.toString(unsorted));

		System.out.println("Quicksort with Randomized pivot and insertion for sub-list size less than 10");
		System.out.println("unSorted array : " + Arrays.toString(unsortedRandomizedPivotWithInsertion));
		QuickSortRandomizedPivotWithInsertion obj4 = new QuickSortRandomizedPivotWithInsertion();
		obj4.randomizedPivotQuicksort(unsortedRandomizedPivotWithInsertion, 0, unsortedRandomizedPivotWithInsertion.length-1);
		System.out.println("Sorted array : " + Arrays.toString(unsorted));

		System.out.println("Quicksort with Median-of-three pivot and insertion for sub-list size less than 10");
		System.out.println("unSorted array : " + Arrays.toString(unsortedMedianOfThreeWithInsertion));
		QuickSortMedianOfThreeWithInsertion obj5 = new QuickSortMedianOfThreeWithInsertion();
		obj5.quicksort(unsortedMedianOfThreeWithInsertion, 0, unsortedMedianOfThreeWithInsertion.length-1);
		System.out.println("Sorted array : " + Arrays.toString(unsorted));

		System.out.println("");
		//System.out.println("Quick Sort Comparisions:"+QuickSortRecursion.countComparision);
		System.out.println("Simple Insertion Sort comparisions:"+InsertionSort.countComparision);
		System.out.println("Simple Quicksort comparisions:"+QuickSortRecursion.countComparision);
		System.out.println("Randomized Pivot Comparisions:"+QuickSortRandomizedPivot.countComparision);
		System.out.println("Median of Three Comparisions:"+QuickSortMedianOfThree.countComparision);
		System.out.println("Quick Sort with Insertion Sort Comparisions:"+QuickSortWithInsertion.countComparision+" + "+QuickSortWithInsertion.countComparisionInsertion+" = "+(QuickSortWithInsertion.countComparision + QuickSortWithInsertion.countComparisionInsertion));
		System.out.println("Randomized Pivot with Insertion Sort Comparisions:"+QuickSortRandomizedPivotWithInsertion.countComparision+ " + "+ QuickSortRandomizedPivotWithInsertion.countComparisionInsertion+" = "+(QuickSortRandomizedPivotWithInsertion.countComparision+QuickSortRandomizedPivotWithInsertion.countComparisionInsertion));
		System.out.println("Median of Three with Insertion Sort Comparisions:"+QuickSortMedianOfThreeWithInsertion.countComparision+" + "+QuickSortMedianOfThreeWithInsertion.countComparisionInsertion+" = "+(QuickSortMedianOfThreeWithInsertion.countComparision+QuickSortMedianOfThreeWithInsertion.countComparisionInsertion));
	}

}
