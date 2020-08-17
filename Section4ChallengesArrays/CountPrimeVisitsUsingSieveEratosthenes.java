package Section4ChallengesArrays;

import java.util.Scanner;

public class CountPrimeVisitsUsingSieveEratosthenes {

	//Since Stack has less memory we'll use this as global!!(stored in Heap)
	static boolean[] arr = new boolean[1000001];

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();

		primeCountUsingSieveOfEratosthenes();
		
		for (int i = 0; i < num; i++) {
			int min = scn.nextInt();
			int max = scn.nextInt();

//          for 11- 20 check the prime from 0 -20 and 0- 10 then subtract them
			
//			int maxCount = primeCountUsingSieveOfEratosthenes(max, arr);
//			int minCount = primeCountUsingSieveOfEratosthenes(min - 1, arr);
//			int count = maxCount - minCount;
			
//			NOTE
//			In the above approach there is an error  since the SieveOfEratostheses() is called twice the complexity increases.
//			hence we'll call it once only
			
//			Hence we'll just call Eratosthenses once 
			
			
			System.out.println(isPrime(min, max));

		}
	}
	
	private static void primeCountUsingSieveOfEratosthenes() {
		// odd no as 1
		for (long i = 3; i <= 1000000; i += 2) {
			arr[(int) i] = true;
		}
		// checking odd no.
		for (long i = 3; i <= 1000000; i += 2) {
			if (arr[(int) i] == true) {
				// changing all the odd no as 1 who are multiple of the number
				for (long j = i * i; j <= 1000000; j += i) {
					arr[(int) j] = false;
				}
			}
		}
		arr[0] = arr[1] = false;
		arr[2] = true;

//		int count = 0;
//		for (int i = 0; i <= 1000000; i++) {
//			if (arr[i] == true) {
//				count++;
//			}
//		}
//
//		System.out.println(count);
//		return count;

	}

	
	
	private static int isPrime( int min, int max) {
		int count =0;
		for(int i= min;i<= max;i++ ) {
			if(arr[i]==true) {
				count++;
			}
		}
		return count;
	}
	
	
	
	
	
//	
//
//	private static int primeCountUsingSieveOfEratosthenes(int num, boolean[] arr) {
//		// odd no as 1
//		for (int i = 3; i <= num; i += 2) {
//			arr[i] = true;
//		}
//		// checking odd no.
//		for (int i = 3; i <= num; i += 2) {
//			if (arr[i] == true) {
//				// changing all the odd no as 1 who are multiple of the number
//				for (long j = i * i; j <= num; j += i) {
//					arr[(int) j] = false;
//				}
//			}
//		}
//		arr[0] = arr[1] = false;
//		arr[2] = true;
//
//		int count = 0;
//		for (int i = 0; i <= num; i++) {
//			if (arr[i] == true) {
//				count++;
//			}
//		}
//
//		System.out.println(count);
//		return count;
//
//	}

}
