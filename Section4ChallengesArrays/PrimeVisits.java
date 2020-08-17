package Section4ChallengesArrays;

import java.util.Scanner;

public class PrimeVisits {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();

		for (int i = 0; i < num; i++) {
			int min = scn.nextInt();
			int max = scn.nextInt();

			primeCount(min, max);

		}

	}

	public static void primeCount(int min, int max) {
		int count =0;
		for (int i = min; i <= max; i++) {
			int temp = 0;
			for (int j = 2; j * j <= i; j++) {
				if (i% j == 0) {
					temp++;
					break;
				}
			}
			if (temp == 0) {
				count++;
//				System.out.println(i);
			}
		}
		System.out.println(count);
		
	}

}
