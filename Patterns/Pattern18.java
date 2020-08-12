package Patterns;

import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.print("Input :");
		int n = scn.nextInt();

		int nst = 1;
		int nsp = n / 2;

		for (int i = 1; i <= n; i++) {

			
			for (int k = 1; k <= nsp; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= nst; j++) {
				System.out.print("*");
			}

			System.out.println();
			if (i <= n / 2) {
				nsp -= 1;
				nst += 2;
			} else {
				nsp += 1;
				nst -= 2;
			}

		}
	}

}

//Input :7
//					  *
//				     ***
//					*****
//				   *******
//					*****
//					 ***
//					  *


