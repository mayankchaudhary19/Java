package Section2Challenges;

import java.util.Scanner;

public class HourGlassPattern {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int nst = (2 * n) + 1;
		int nsp = 0;
		int temp1 = 0;
		for (int i = 0; i < (2 * n) + 1; i++) {

			for (int j = 0; j < nsp; j++) {
				System.out.print("  ");
			}
			
			int temp3=temp1;
			int temp2 = 1;
			for (int k = 0; k < nst; k++) {

				if (k < (nst / 2) + 1) {
					if (i < n)
						System.out.print(n - i - k + " ");
					else {
						System.out.print(temp3 + " ");
						temp3--;
					}

				} else {
					System.out.print(temp2 + " ");
					temp2++;
				}

//				System.out.print("* ");
			}
			if (i < n) {
				nsp++;
				nst -= 2;
			} else {
				temp1++;
				nsp--;
				nst += 2;
			}
			System.out.println();

		}
	}

}

//						5 4 3 2 1 0 1 2 3 4 5
//						  4 3 2 1 0 1 2 3 4 
//						    3 2 1 0 1 2 3 
//						      2 1 0 1 2 
//						        1 0 1 
//						          0 
//						        1 0 1 
//						      2 1 0 1 2 
//						    3 2 1 0 1 2 3 
//						  4 3 2 1 0 1 2 3 4 
//						5 4 3 2 1 0 1 2 3 4 5