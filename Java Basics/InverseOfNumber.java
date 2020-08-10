import java.util.Scanner;

public class InverseOfNumber {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		
		System.out.println("Input: ");
		
		int i = 1;
		int output = 0;
		
		while (num!=0) {

			int val = num % 10;
			System.out.println(i + "," + val);

			output = output + (i * (int) Math.pow(10, val-1));

			i++;
			num = num / 10;
		}

		System.out.println("Output: ");
		System.out.println(output);

	}

}

//Input:
//pos:   654321
//  	 613254

//input 4 ki pos 1 hai to output mai 4pos ki value 1hogi

//Outout:
//pos:   654321
//  	 621435