package Section4ChallengesArrays;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		long[] arr = new long[num];

		for (int i = 0; i < num; i++) {
			long val = scn.nextInt();
			arr[i] = val;
		}
		long findNum = scn.nextInt();

		System.out.println(binarySearch(arr, findNum));

	}

	private static int binarySearch(long[] arr, long num) {

		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;
			if (num > arr[mid]) {
				left = mid + 1;
			} else if (num < arr[mid]) {
				right = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

}
