package Section2Challenges;

import java.util.Scanner;

public class PrateekLovesCandy {  
	
	//TODO
	
	//sieve of eratosthenes approach to be used part of array!!

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();

		while (num != 0) {
			int input = scn.nextInt();
			getMaxPrimeNumbers(input);
			num--;
		}
	}

	private static void getMaxPrimeNumbers(int num) {

		int amount = 0;
		int count = num;
		for (int i = 1; i <= 100; i++) {
//			System.out.println("Hey");
			for (int j = 2; j * j <= i; j++) {
				if(count!=0) {
					if(i%j!=0) {
						amount = i;
						count--;
					}
					break;
				}
//				
//				if (i % j != 0 && count != 0) {
//					amount = i;
//					count--;
//					break;
//					
//				}
			}
		}

		System.out.println(amount);

	}

}
