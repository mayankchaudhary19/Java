package Patterns;

import java.util.Scanner;

public class Pattern21 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.print("Input :");
		int n = scn.nextInt();

		int nsp = (2 * n) - 3;
		int nst = 1;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= nst; j++) {
				System.out.print("*");
			}

			for (int k = 1; k <= nsp; k++) {
				System.out.print(" ");
			}

			int l = 1;				//explicitly define the last v
			if (i == n) {
				l = 2;
			}
			
			for (; l <= nst; l++) {
				System.out.print("*");
			}

			System.out.println();
			nsp -= 2;
			nst += 1;

		}
	}

}


//Input :5
//					*       *
//					**     **
//					***   ***
//					**** ****
//					*********

