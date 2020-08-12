package Patterns;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.print("Input :");
		int n = scn.nextInt();

		int nst = 1;
		for (int i = 1; i <= (2 * n) - 1; i++) {

			for (int j = 1; j <= nst; j++) {
				System.out.print("*");
			}
			System.out.println("");

			if (i < (2 * n) / 2) {
				nst++;
			} else {
				nst--;
			}

		}

	}
}

//Input :5
//					*
//					**
//					***
//					****
//					*****
//					****
//					***
//					**
//					*