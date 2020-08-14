package Section2Challenges;

import java.util.Scanner;

public class PatternTriangle {

	public static void main(String[] args) {
		

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst=1;
		int nsp=n-1;
		for(int i=1;i<=n;i++) {
			int num=i;
			for(int j=1;j<=nsp;j++) {
				System.out.print("\t");
			}
			for(int k=1;k<=nst;k++) {
				System.out.print(num+"\t");
				if(k<=(nst/2)) {
					num++;
				}else {
					num--;
				}
			
			}
			nst+=2;
			nsp-=1;
			System.out.println();
		}
		
		
	}

}


//OUTPUT:	when N=4		

			//      1 
			//    2 3 2
			//  3 4 5 4 3
			//4 5 6 7 6 5 4