package Section2Challenges;

import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();

		int root1, root2;

		int discriminate = (b * b) - (4 * a * c);

		root1 = (-b + (int) Math.pow(discriminate, 0.5)) / 2 * a;
		root2 = (-b - (int) Math.pow(discriminate, 0.5)) / 2 * a;

		if (discriminate > 0) {				
				System.out.println("Real and Distinct");
				if (root1 < root2) {
					System.out.print(root1 + " " + root2);
				} else {
					System.out.print(root2 + " " + root1);
				}

		} else if (discriminate == 0) { 
			System.out.println("Real and Equal");
			System.out.print(root1 + " " + root2);
			
		} else if (discriminate < 0) {
			System.out.println("Imaginary");

		}

	}

}
