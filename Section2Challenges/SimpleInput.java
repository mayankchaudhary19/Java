package Section2Challenges;

import java.util.Scanner;

public class SimpleInput {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int sum = 0;

		while (sum >= 0) {
			int num = scn.nextInt();
			sum += num;
			if(sum>=0)
			System.out.println(num);
		}

	}

}
