package Section2Challenges;

import java.util.Scanner;

public class BasicCalculator {

	private static char ch;
	private static long num1, num2;

	private static void inputs() {
		Scanner scn = new Scanner(System.in);
		ch = scn.next().charAt(0);

		if (ch == 'x' && ch == 'X') {
			System.exit(0);
		} else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
			num1 = scn.nextInt();
			num2 = scn.nextInt();
		}

	}

	public static void main(String[] args) {

		long output = 0;
		do {
			inputs();

			switch (ch) {
			case '+':
				output = num1 + num2;
				System.out.println(output);
				break;
			case '-':
				output = num1 - num2;
				System.out.println(output);
				break;
			case '*':
				output = num1 * num2;
				System.out.println(output);
				break;
			case '/':
				output = num1 / num2;
				System.out.println(output);
				break;
			case '%':
				output = num1 % num2;
				System.out.println(output);
				break;
//			case 'X':
//			case 'x':
//				System.exit(0);
//				break;
			default:
				System.out.println("Invalid operation. Try again.");

			}

		} while (ch != 'x' && ch != 'X');

	}

}
