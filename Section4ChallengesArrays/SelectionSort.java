package Section4ChallengesArrays;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		long[] arr = new long[num];

		for (int i = 0; i < num; i++) {
			int val = scn.nextInt();
			arr[i] = val;
		}

		selectionSort(arr);

		for (long i : arr) {
			System.out.println(i);
		}

	}

	public static void selectionSort(long[] arr) {
		for (int counter = 0; counter < arr.length; counter++) {
			int min = counter;
			for (int j = counter + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			long temp = arr[counter];
			arr[counter] = arr[min];
			arr[min] = temp;
		}
	}

}
