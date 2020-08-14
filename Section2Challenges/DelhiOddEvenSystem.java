package Section2Challenges;

import java.util.Scanner;

public class DelhiOddEvenSystem {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();

		while (num != 0) {
			int input = scn.nextInt();
			int oddSum = 0;
			int evenSum = 0;
			while (input != 0) {
				int rem = input % 10;

				if (rem % 2 == 0) {
					evenSum += rem;
				} else {
					oddSum += rem;

				}
				input /= 10;
			}
			if (evenSum % 4 == 0 || oddSum % 3 == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			num--;
		}

	}

}
