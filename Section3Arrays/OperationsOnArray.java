package Section3Arrays;

import java.util.Scanner;

public class OperationsOnArray {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
//		int[] array = takeInput();
//		displayArray(array);
		int[] arr = { 25, 12, 45, 65, 67, 43, 123, 4353, 65, 2 };
		System.out.println(maxInArray(arr));

		System.out.println(linearSearch(arr, 43));

		// ARRAY SHOULD BE SORTED FOR BINARY SEARCH
		int[] arr1 = { 12, 15, 25, 32, 45, 65, 67, 73, 123, 353, 400 };
		System.out.println(binarySearch(arr1, 123));
		System.out.println(binarySearch(arr1, 1203));

		int[] arr2 = { 12, 15, 2, 32, 45, 5, 67, 73, 13, 33, 40 };
		System.out.println("SORTING");
//      bubbleSort(arr2); //dec. order
//		selectionSort(arr2); // inc. order
		insertionSort(arr2);
		displayArray(arr2);

	}

	public static int[] takeInput() {
		System.out.print("SIze?");
		int size = scn.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter value of " + i + " index:");
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static void displayArray(int[] arr) {

		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int maxInArray(int[] arr) {
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	// O(N) complexity
	public static int linearSearch(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				return i;
			}
		}
		return -1; // item not present in whole array
	}

	// O(log(N) :base 2 complexity
	//ARRAY SHOULD BE SORTED
	public static int binarySearch(int[] arr, int num) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (high + low) / 2;

			if (num > arr[mid]) {
				low = mid + 1;
			} else if (num < arr[mid]) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;

	}

//	O(NlogN) complexity
	public static void bubbleSort(int[] arr) { // void return type: since the array is already in heap

		for (int counter = 0; counter < arr.length - 1; counter++) { // since one element will be already on its place
																		// on last iteration
			for (int j = 0; j < (arr.length - 1) - counter; j++) { // since the element which are already sorted need
																	// not to be compared again
				if (arr[j] < arr[j + 1]) { // decreasing order
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void selectionSort(int[] arr) {
		for (int counter = 0; counter < arr.length - 1; counter++) {
			int min = counter;
			for (int j = counter + 1; j < arr.length - 1; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[counter];
			arr[counter] = arr[min];
			arr[min] = temp;

		}
	}

	public static void insertionSort(int[] arr) {
		for (int counter = 1; counter <= arr.length - 1; counter++) {

			int val = arr[counter];
			int j = counter - 1;
			while (j >= 0 && arr[j] > val) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = val;

//			for (; j >= 0; j--) {
//				if (arr[j] > val) {
//					arr[j + 1] = arr[j];
//				}
//			}
//			arr[j + 1] = val;
		}
	}

}
