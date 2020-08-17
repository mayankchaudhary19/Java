package Section4ChallengesArrays;

import java.util.Scanner;

public class PrintPrimeVisitsSieveOfEratosthenes {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();

//SieveOfEratosthenes

		int[] arr = new int[1000000];

		for (int i = 0; i < num; i++) {
			int min = scn.nextInt();
			int max = scn.nextInt();

			primeCountUsingSieveOfEratosthenes(max, arr);

		}

	}

	private static void primeCountUsingSieveOfEratosthenes( int max, int[] arr) {
		//making all odd no. value as 1 since they a possibility of being prime where as odd no . don't have it.
		for(int i=3;i<= max;i+=2) {
			arr[i]=1;
		}
		//sieve method
		for(int i=3;i<= max;i+=2) {
			if(arr[i]==1) {
				for( int j=i*i;j<=max;j=j+i) {
					arr[j]=0;
				}
			}
		}
		
		arr[0]=arr[1]=0;
		arr[2]=1;
		int count = 0 ;
		for(int i = 0; i <= max; i++){ 
            if(arr[i] == 1) {
            	 count++;
                 System.out.print(i + " ");
            }
   
           
        }
	
		System.out.println(" COUNT: "+count);
	}
}
