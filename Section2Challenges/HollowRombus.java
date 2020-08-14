package Section2Challenges;

import java.util.Scanner;

public class HollowRombus {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int nsp = n - 1;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= nsp; j++) {
				System.out.print(" ");
			}

			if (i == 1 || i == n) {
				for (int k = 1; k <= n; k++) {
					System.out.print("*");
				}
			} else {
				System.out.print("*");
				for (int k = 1; k < n-1; k++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			nsp--;
			System.out.println();
		}

	}
}

//
//	  *****
//   *   *
//  *   *
// *   *
//*****