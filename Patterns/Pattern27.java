package Patterns;

import java.util.Scanner;

public class Pattern27 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.print("Input :");
		int n = scn.nextInt();

		int nsp = n - 1;
		int nst = 1;

		for (int i = 1; i <= n; i++) {

			int val=0;
			for (int j = 1; j <= nsp; j++) {
				System.out.print(" ");
			}
			
			for (int k = 1; k <= nst; k++) {
			
				if(k<=i) {        //or k<=nst/2
					val++;
				}else {
					val--;
				}
				
				System.out.print(val);
			
				
			}
			System.out.println();
			nsp-=1;
			nst+=2;
		}

	}

}


//Input :5
//						    1
//						   121
//						  12321
//						 1234321
//						123454321

