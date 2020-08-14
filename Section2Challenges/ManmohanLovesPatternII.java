package Section2Challenges;

import java.util.Scanner;

public class ManmohanLovesPatternII {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();

		for (int i = 0; i < num; i++) {

			for (int j = 0; j <= i; j++) {

				if (i == 0) {
					System.out.print(1);
				} else if (j == 0 || j == i) {
					System.out.print(i);
				} else {
					System.out.print(0);
				}

			}
			System.out.println(" ");
		}

	}

}
