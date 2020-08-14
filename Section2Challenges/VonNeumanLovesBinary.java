package Section2Challenges;

import java.util.Scanner;

public class VonNeumanLovesBinary {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int binary = 0;

		for (int i = 1; i <= n; i++) {
			binary = scn.nextInt();
			int decimal = 0;
			double count = 0;
			while (binary != 0) {

				int rem = binary % 10;
				decimal = decimal + (int) (rem * Math.pow(2, count));

				count++;
				binary = binary / 10;
			}
			System.out.println(decimal);
		}

	}

}
