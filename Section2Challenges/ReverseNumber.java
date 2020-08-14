package Section2Challenges;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int input = scn.nextInt();
		int output=0;
		while(input!=0) {
			int rem= input%10;
			output=output*10+rem;
			input/=10;
		}
		System.out.println(output);
	}

}
