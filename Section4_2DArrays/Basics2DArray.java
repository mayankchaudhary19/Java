package Section4_2DArrays;

import java.util.Scanner;

public class Basics2DArray {

	public static void main(String[] args) {

		int[][] arr = new int[3][3];

		System.out.println(arr[0][0]);

		dispaly(arr);
		arr[0][0] = 10;
		arr[2][0] = 20;
		arr[1][2] = 90;
		dispaly(arr);

//		int[][] arr1= new int[][3]; // error 

		int[][] arr1 = new int[3][];

		arr1[0] = new int[4];
//		arr1[1] = new int[2 ];
		arr1[2] = new int[3];
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
//		System.out.println(arr1[3]);//array index out of bound exception
//		dispaly(arr1);

		System.out.println(arr1[0][2]);
//		System.out.println(arr1[1][2]); // null pointer exception

		int[][] arr2 = takeInput();
		dispaly(arr2);
		
//		Hard-coding of 2D array
		int[][] arr3 ={{1,2,3},{4,5,6},{7,8,9}};
		dispaly(arr3);
	}

	public static int[][] takeInput() {
		Scanner scn = new Scanner(System.in);
		System.out.print("ENTER NO OF ROWS:");
		int rows = scn.nextInt();

		int[][] arr = new int[rows][];

		for (int row = 0; row < rows; row++) {
			System.out.print("ENTER NO OF COLUMNS FOR " + (row + 1) + " ROW:");
			int cols = scn.nextInt();
			arr[row]=new int[cols];
			for (int col = 0; col < cols; col++) {
				System.out.print("ENTER VALUE OF ROW " + (row + 1) + ", COLUMN " + (col + 1) + ":");
				arr[row][col] = scn.nextInt();
			}
		}

		return arr;
	}

	public static void dispaly(int[][] arr) {
		System.out.println("DISPLAY");
		for (int i = 0; i < arr.length; i++) { // i= row
			for (int j = 0; j < arr[i].length; j++) { // j=col
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
