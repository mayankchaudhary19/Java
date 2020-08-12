package Patterns;

import java.util.Scanner;

public class Pattern32 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.print("Input :");
		int n = scn.nextInt();

		int nst = 1;
		
		int val=1;

		for (int i = 1; i <= (2 * n) - 1; i++) {
			
			for (int k = 1; k <= nst; k++) {
				
				if(k%2==0)
				System.out.print("*");
				else {
					System.out.print(val);
				}
			}

			System.out.println();

			if (i < n) {
				nst += 2;
				val++;
			}
			
			else {
				nst -= 2;
				val--;
			
			}
				
		}

	}

}


//Input :5
//					1
//					2*2
//					3*3*3
//					4*4*4*4
//					5*5*5*5*5
//					4*4*4*4
//					3*3*3
//					2*2
//					1

