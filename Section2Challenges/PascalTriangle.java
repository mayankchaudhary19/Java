package Section2Challenges;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();

		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(nCr(i, j) + "\t");
			}
			System.out.println();
		}
	}

	private static int factorial(int no) {
		int count = no;
		int val = 1;
		while (count >= 1) {
			val = val * count;
			count--;
		}
		return val;
	}

	private static int nCr(int n, int r) {
		return factorial(n) / (factorial(r) * factorial(n - r));

	}

}
