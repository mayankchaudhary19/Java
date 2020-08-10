import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		System.out.print("Enter Your number:");
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();

		int ans=0;
		
		while (num != 0) {
			int rem = num % 10;
			ans =  ans*10+rem;
			num/=10;
		}

		System.out.println(ans);
	}

}
