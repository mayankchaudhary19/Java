import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int input = scn.nextInt();

//		int counter = 2;
		boolean flag = true;

//		while (counter <= input - 1) {
//			if (input % counter == 0) {
//				flag = false;
//			}
//			counter += 1;
//		}

		// Note for optimization
		for (int i = 2; i * i <= input; i++) {
			if (input % 2 == 0) {
				flag = false;
			}
		}

		System.out.println(flag);
	}

}
