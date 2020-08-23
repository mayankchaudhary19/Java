package Section4ChallengesArrays;

import java.util.Scanner;

public class chewbaccaAndNumbers {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		long num = scn.nextLong();
		int count = 0;
		long temp = num;
		while (num != 0) {
			count++;
			num = num / 10;
		}

		int[] arr = new int[count];

		for (int i = arr.length - 1; temp != 0; i--) {

			arr[i] = (int) (temp % 10);

			temp = temp / 10;

		}
		for (int i = 0; i < arr.length; i++) {
				
			if(arr[i]==9&&i==0) {
				arr[0]=9;
			}else{
					if(arr[i]>=5) {
					arr[i]= 9-arr[i];
				}
			}
			
			
			System.out.print(arr[i]);
		}

	}

}