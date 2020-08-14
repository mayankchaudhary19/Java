package Section2Challenges;

import java.util.Scanner;

public class InvertedGlassHourPattern {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int nst = 1;
		int nsp = 2 * n - 1;
		int nst2 = 1;
		for (int i = 1; i <= 2 * n + 1; i++) {
			int temp = n;
			int temp2 = n - nst + 1;
			int j = 1;
			if (i == n + 1)
				j = 2;
			for (; j <= nst; j++) {
				System.out.print(temp + " ");
				temp--;
			}
			for (int k = 1; k <= nsp; k++) {
				System.out.print("  ");
			}
			for (int l = 1; l <= nst; l++) {
				System.out.print(temp2 + " ");
				temp2++;
			}
			if (i < n + 1) {
				nst++;
				nsp -= 2;

			} else {
				nst--;
				nsp += 2;
			}
			System.out.println();

		}

	}

}

//					
//					5                   5 
//					5 4               4 5 
//					5 4 3           3 4 5 
//					5 4 3 2       2 3 4 5 
//					5 4 3 2 1   1 2 3 4 5 
//					5 4 3 2 1 0 1 2 3 4 5 
//					5 4 3 2 1   1 2 3 4 5 
//					5 4 3 2       2 3 4 5 
//					5 4 3           3 4 5 
//					5 4               4 5 
//					5                   5 
