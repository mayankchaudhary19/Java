package Section2Challenges;

import java.util.Scanner;

public class ManmohanLovesPatternI {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		for (int i=1; i<=n;i++){
			for (int j=1 ;j<=i;j++){
				//even
				if(i%2==0){
					if(j==1||j==i){
						System.out.print(1);
					}else{
						System.out.print(0);
					}
				
				}else{
					System.out.print(1);
				}
			}

			System.out.println();
		}

	}

}
