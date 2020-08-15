package Sections3Functions;

public class DemoFunctions_AdditionOfNumbers {

	public static void main(String[] args) {
		System.out.println("START");
		addition();
		additionParams(10, 30);
		
		System.out.println(additionReturn(30, 20));
  		System.out.println("STOP");
	}
	
	public static void addition() {   //function without parameters
		int a=10;
		int b=20;
		int sum = a + b;
		System.out.println(sum);
	}


	public static void additionParams(int a, int b) {   //function with parameters
		int sum = a + b;
		System.out.println(sum);
	}

	
	public static int additionReturn(int a, int b) {   //function with parameters
		int sum = a + b;
		return sum;
	}
}
