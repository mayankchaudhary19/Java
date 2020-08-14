package Section2Challenges;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {


		Scanner scn = new Scanner(System.in);
		int min = scn.nextInt();
		int max = scn.nextInt();
		int step = scn.nextInt();
		int celsius=0;
		for(int i=min;i<=max;i+=step) {
			celsius=((i-32)*5)/9;
			System.out.println(i+"\t"+celsius);
		}

	}

}
