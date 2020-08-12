package Patterns;

import java.util.Scanner;

public class Pattern24 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.print("Input :");
		int n = scn.nextInt();

		int nsp = n - 1;
		int nst = 1;
		

		for (int i = 1; i <= n; i++) {
			
			int val = i;
			
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

//					Input :5
//								    1 
//								   222 
//								  33333 
//								 4444444 
//								555555555 

