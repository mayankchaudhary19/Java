package Patterns;

import java.util.Scanner;

public class Pattern23 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.print("Input :");
		int n = scn.nextInt();

		int nsp = n - 1;
		int nst = 1;
		int val = 1;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= nsp; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= nst; k++) {
				System.out.print(val);
			}
			System.out.println(" ");
			nsp -= 1;
			nst += 2;

		}
	}

}

//Input :5
//				    1 
//				   111 
//				  11111 
//				 1111111 
//				111111111 
