import java.util.Scanner;

public class AgeComparision {
	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		int n = scn.nextInt();
		
		if(n<12) {
			System.out.println("child");
		}else if(n>=12 && n<=18){
			System.out.println("teenager");
		}else if(n>17 && n<60) {
			System.out.println("adult");
		}else {
			System.out.println("old");
			
		}

	}
}
