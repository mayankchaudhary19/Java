package Sections3Functions;

public class AnybaseToDecimal {

	public static void main(String[] args) {

		System.out.println(anyBase2Decimal(1423, 5));
		System.out.println(decimal2AnyBase(238, 5));

	}
	
	public static int anyBase2Decimal(int num , int base) {				//num == souce no. and base == source base
		int tempbase= 1;
		int val=0;
		while( num!=0) {
			int rem = num%10;
			val=val+rem*tempbase;
			tempbase= tempbase*base;
			num/=10;
		}
		return val;
	}
	
	public static int decimal2AnyBase(int snum , int db) {
		int val=0;
		int temp=1;
		while(snum!=0) {
			int rem = snum %db;
			val=val+rem*temp;
			temp*=10;
			snum=snum/db;
		}
		return val;
	}

}
