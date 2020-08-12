package Patterns;

import java.util.Scanner;

public class Pattern0 {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			System.out.print("*");
			System.out.println("\n");
		}
		
		System.out.print("Input");
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();			//initialization no of rows
			
		int i=0;						
		while(i<=n){					
			System.out.print("*");		//work
			
			System.out.println();		//preparation
			i++;						//preparation

		}

	}

}

//OUTPUT:
//				*
//				
//				*
//				
//				*
//				
//				*
//				
//				*
//				

