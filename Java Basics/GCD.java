import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Divident");
		int divident = scn.nextInt();
		System.out.println("Divisor");
		int divisor = scn.nextInt();

		while (divident % divisor != 0) {
			int rem = divident % divisor;
			divident = divisor;
			divisor = rem;
		}
		System.out.println("GCD/HCF:");
		System.out.println(divisor);

//		System.out.println("Divident");
//		int num1 = scn.nextInt();
//		System.out.println("Divisor");
//		int num2 = scn.nextInt();
//		
//		int rem;
//		while(num1%num2!=0) {
//			rem= num1%num2;
//			num1=num2;
//			num2=rem;
//		}
//		System.out.println("GCD/HCF:");
//		System.out.println(num2);
	}

}
