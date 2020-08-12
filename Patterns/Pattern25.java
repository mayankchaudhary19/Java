package Patterns;

import java.util.Scanner;

public class Pattern25 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.print("Input :");
		int n = scn.nextInt();

		int nsp = n - 1;
		int nst = 1;
		int val=1;

		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= nsp; j++) {
				System.out.print("\t");
			}
			for (int k = 1; k <= nst; k++) {
				System.out.print(val+"\t");
				val++;
				
			}
			System.out.println();
			nsp -= 1;
			nst += 2;

		}
	}

}

//Input :5
//								1	
//							2	3	4	
//						5	6	7	8	9	
//					10	11	12	13	14	15	16	
//				17	18	19	20	21	22	23	24	25
//
