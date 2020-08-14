package Section2Challenges;

import java.util.Scanner;

public class PatternSeries3nPlus2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int N1 = scn.nextInt();
		int N2 = scn.nextInt();

		int count = 0;
		int i = 1;
		while (count <= N1) {
			int num = (3 * i) + 2;
			if (num % N2 != 0) {
				System.out.println(num);
				count++;
			}
			i++;

		}

	}

}
