package Patterns;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {

		System.out.print("Input1 :");

		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();

		for (int i = 0; i < n1; i++) {

			for (int j = 0; j < n1 - i-1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		// 2

		System.out.print("Input2 :");
		int n2 = scn.nextInt();

		int nsp = n2 - 1;
		int nst = 1;

		for (int i = 1; i <= n2; i++) {

			for (int j = 1; j <= nsp; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= nst; k++) {
				System.out.print("*");
			}
			System.out.println();
			nsp -= 1;
			nst += 1;
		}
	}

}

//Input1 :5
//					*
//					**
//					***
//					****
//					*****
