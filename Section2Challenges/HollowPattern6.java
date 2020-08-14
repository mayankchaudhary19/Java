package Section2Challenges;

import java.util.Scanner;

public class HollowPattern6 {
	
	//TODO 

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst=n;
		int nsp=0;

		for (int i = 1; i <= n; i++) {
			
			for(int j=1;j<=nst;j++) {
				System.out.println("*");
			}
			
			for(int j=0;j<=nsp;j++) {
				System.out.println(" ");
			}

			System.out.println();

		}
	}

}
