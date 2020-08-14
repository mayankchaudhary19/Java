package Section2Challenges;

import java.util.Scanner;

public class PatternNumbersAndStars1 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst =1;
		for (int i = 1; i <= n; i++) {
			int val = 1;
			for (int j = 1; j <= n + 1 - i; j++) {
				System.out.print(val);
				val++;
			}
			if (i >= 2) {
				for (int k = 1; k <= nst; k ++) {
					System.out.print("*");
				}nst+=2;
			}
			
			System.out.println();
		}
	}

}
