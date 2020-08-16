package Section4_2DArrays;

public class SpiralPrint {

	public static void main(String[] args) {

		int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };

		spiralPrintClockwise(arr);
	}

	public static void spiralPrintClockwise(int[][] arr) {

		int left, right, top, bottom, count, dir;
		left = 0;
		top = 0;
		right = arr[top].length - 1;
		bottom = arr.length - 1;
		count = (right + 1) * (bottom + 1);
		dir = 1;

		while (left <= right && top <= bottom) {
			if (count > 0) {
				if (dir == 1) {
					for (int i = left; i <= right; i++) {
						System.out.print(arr[top][i] + " ");
						count--;
					}

					dir = 2;
					top++;
				}
				if (dir == 2) {

//					System.out.println("RIGHT"+top);
					for (int i = top; i <= bottom; i++) {
						System.out.print(arr[i][right] + ", ");
						count--;
					}
					right--;
					dir = 3;
				}

				if (dir == 3) {
					for (int i = right; i >= left; i--) {
						System.out.print(arr[bottom][i] + ", ");
						count--;
					}
					bottom--;
					dir = 4;
				}

				if (dir == 4) {
					for (int i = bottom; i >= top; i--) {
						System.out.print(arr[i][left] + ", ");
						count--;
					}
					left++;
					dir = 1;
				}

			}
		}
		System.out.println("END");
	}

}
