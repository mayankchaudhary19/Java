import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fib1 = 0;
		int fib2 = 1;
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		
		int fib3 = 0;     //sum is fib3
		
		int i = 0;
		while (i <= num) {
			System.out.print(fib1 + ", ");
			fib3 = fib1 + fib2;
			fib1 = fib2;
			fib2 = fib3;
			i++;
		}
	}

}
