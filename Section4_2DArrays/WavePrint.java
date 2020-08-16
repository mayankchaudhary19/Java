package Section4_2DArrays;

import java.util.Scanner;

public class WavePrint {

	public static void main(String[] args) {

//		System.out.println(input());

		int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
//		System.out.println();

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + "\t");
//			}
//			System.out.println();
//		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i % 2 == 0) {
					System.out.print(arr[i][j] +" ");
				}else {
					System.out.print(arr[i][arr[i].length-1-j] +" ");
				}
			}
		}

		System.out.print("END");
	}

	public static int[][] input() {
		System.out.println("ROWS?");
		Scanner scn = new Scanner(System.in);
		int rows = scn.nextInt();
		int[][] arr = new int[rows][];
		for (int i = 0; i < rows; i++) {
			System.out.println("COLUMS? of " + (i + 1) + "row");
			int cols = scn.nextInt();
			arr[i] = new int[cols];
			for (int j = 0; j < cols; j++) {
				System.out.println("VAL? OF" + (i + 1) + "," + (j + 1));
				arr[i][j] = scn.nextInt();
			}

		}

		return arr;
	}

}
