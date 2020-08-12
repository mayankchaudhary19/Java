package Patterns;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		
		for(int i = 0;i<5; i++) {
			for( int j =0; j<5 ;j++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
		System.out.print("Input :");
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		
		int row=0;
		while(row<n) {
			int col=0;
			while(col<n) {
				System.out.print("* ");
				col+=1;
			}
			System.out.println();
			row+=1;
		}
	}

}

//OUTPUT:
//			* * * * * 
//			* * * * * 
//			* * * * * 
//			* * * * * 
//			* * * * *