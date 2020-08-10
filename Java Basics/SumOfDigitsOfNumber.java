



import java.util.Scanner;

public class SumOfDigitsOfNumber {

	static int getSum(int num) {

		int sum = 0;

		while (num != 0) {
			
			sum = sum + num % 10;
			
			num= num/10;
		}

		return sum;

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();

		
		
		System.out.println(getSum(num));

	}

}
