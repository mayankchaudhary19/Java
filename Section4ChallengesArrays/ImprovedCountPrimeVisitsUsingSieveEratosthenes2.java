package Section4ChallengesArrays;

import java.util.Scanner;

public class ImprovedCountPrimeVisitsUsingSieveEratosthenes2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();

		for (int i = 0; i < num; i++) {
			int min = scn.nextInt();
			int max = scn.nextInt();

			int[] arr = new int[1000000]; //
		// for 11- 20  check the prime from 0 -20 and 0- 10 then subtract them	
			int maxCount=primeCountUsingSieveOfEratosthenes(max, arr);  
			int minCount=primeCountUsingSieveOfEratosthenes(min-1, arr);
			int count= maxCount-minCount;
			System.out.println(count);

		}
	}

	private static int primeCountUsingSieveOfEratosthenes(int num, int[] arr) {
		// odd no as 1
		for (int i = 3; i <= num; i += 2) {
			arr[i] = 1;
		}
		// checking odd no.
		for (int i = 3; i <= num; i += 2) {
			if (arr[i] == 1) {
				// changing all the odd no as 1 who are multiple of the number
				for (int j = i * i; j <= num; j += i) {
					arr[j] = 0;
				}
			}
		}
		arr[0] = arr[1] = 0;
		arr[2] = 1;
		

		int count =0;
		for(int i= 0 ; i<= num;i++) {
			if(arr[i]==1) {
				count++;
			}
		}
		
		System.out.println(count);
		return count;

	}

}
