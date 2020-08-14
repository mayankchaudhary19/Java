package Section2Challenges;

import java.util.Scanner;

public class GaneshaPatternSwastik {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();

		for (int i = 1; i <= num; i++) {

			for (int j = 1; j <= num; j++) {

				if (j == 1 && i <= num / 2) {
					System.out.print("*");
				} else if (j == num && i > num / 2 + 1) {
					System.out.print("*");
				} else if (j == num / 2 + 1 || i == num / 2 + 1) {
					System.out.print("*");
				} else if (i == 1 && j > num / 2 + 1) {
					System.out.print("*");
				} else if (i == num && j < num / 2 + 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

	}

}
