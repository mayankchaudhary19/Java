package Section4ChallengesArrays;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		long[] arr = new long[num];

		for (int i = 0; i < num; i++) {
			int val = scn.nextInt();
			arr[i] = val;
		}

		bubbleSort(arr);

		for (long i : arr) {
			System.out.println(i);
		}

	}

	private static void bubbleSort(long[] arr) {
		for (int counter = 0; counter < arr.length; counter++) {
			for (int j = 0; j < arr.length - counter ; j++) {
				if (arr[j] > arr[j + 1]) {
					long temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	
}
