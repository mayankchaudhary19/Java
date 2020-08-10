import java.util.Scanner;

public class DigitisOfNumber {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		
		int len=0;
		
		int temp=num;
		
		int val=0;
		
		
		while(temp!=0) {
			len=len+1;
			temp=temp/10;
		}
		
		
		while(len!=0){
			
			val=(int) (num/(Math.pow(10, len-1)));
			
			System.out.println(val);

			num=(int)(num%(Math.pow(10, len-1)));

			len--;
		}
		

	}

}
