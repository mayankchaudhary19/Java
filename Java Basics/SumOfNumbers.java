import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {

		int sum = 0;
		System.out.print("How many numbers??");
		Scanner scn = new Scanner(System.in);
		int numbers = scn.nextInt();
		int i = 1;

		while (i <= numbers) {
			System.out.print("Your number" + i+" ");
			scn = new Scanner(System.in);
			int no = scn.nextInt();
//			sum=no+sum;
			sum += no;
			i++;
		}
		System.out.println("Sum is: " + sum);
	}
}
