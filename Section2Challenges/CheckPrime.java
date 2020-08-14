package Section2Challenges;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		boolean isPrime=true;
		
		for(int i =2;i*i<=n;i++) {
			if(n%i==0) {
				isPrime=false;
			}
		}

		if(isPrime) {
			
			System.out.println("Prime");
		}else
			System.out.println("Not Prime");
	}

}
