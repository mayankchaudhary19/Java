package Patterns;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {

		System.out.print("Input1 :");

		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();

		for (int i = 0; i < n1; i++) {

			for (int j = n1-i; j > 0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.print("Input2 :");
		int n2 = scn.nextInt();
		for (int i = 0; i < n2; i++) {

			for (int j = n2; j >i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		

	}

}


//Input1 :5
//				* * * * * 
//				* * * * 
//				* * * 
//				* * 
//				* 
//
