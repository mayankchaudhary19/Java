package Section2Challenges;

import java.util.Scanner;

public class PatternNumbersAndStars2 {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		for(int i=1;i<=n;i++) {
			int val=1;
			for (int j=1;j<=n;j++) {
				if(j<=i) {
					System.out.print(val);
					val++;
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
