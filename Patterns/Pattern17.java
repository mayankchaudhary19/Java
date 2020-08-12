package Patterns;

import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.print("Input :");
		int n = scn.nextInt();

		int nst = n / 2;
		int nsp = 1;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= nst; j++) {
				System.out.print("*");
			}

			for (int k = 1; k <= nsp; k++) {
				System.out.print(" ");
			}

			for (int l = 1; l <= nst; l++) {
				System.out.print("*");
			}

			System.out.println();
			if (i <= n / 2) {
				nst -= 1;
				nsp += 2;
			} else {
				nst += 1;
				nsp -= 2;
			}

		}
	}

}


//Input :7
//					*** ***
//					**   **
//					*     *
//					       
//					*     *
//					**   **
//					*** ***

