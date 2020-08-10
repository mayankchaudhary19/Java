import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println("Input:"+n);

		if (n % 2 == 0)
			System.out.println("Output: EVEN");
		else
			System.out.println("Output: ODD");

	}

}
