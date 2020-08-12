package Patterns;

import java.util.Scanner;

public class Pattern34 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();

		int nst = 1;

		for (int i = 1; i <= num; i++) {

			int val = i;

			for (int j = 1; j <= nst; j++) {

				
				System.out.print(val);
				if(j<=nst/2) {
					val++;
				}
				else val--;
				
			}
			System.out.println("");
			nst += 2;
			
		}

	}

}
