package Section2Challenges;

import java.util.Scanner;

public class PythagorasTriplet {

	public static void main(String[] args) {

		//2.8.26 notes
		Scanner scn = new Scanner(System.in);
		long a = scn.nextLong();			// can be base or height
		long b;
		long c;

		if (a <= 2) {
			System.out.println(-1);
		} else {
			if (a % 2 == 0) {
				b = ((a * a) / 4) - 1;
				c = ((a * a) / 4) + 1;
			} else {

				b = ((((a * a) + 1) / 2)-1);  //b = ((((a * a) -1 ) / 2));
				c = (((a * a) + 1) / 2);
			}

			System.out.println(b + " " + c);
		}
	}

}
