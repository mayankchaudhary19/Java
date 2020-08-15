package Section3Arrays;

public class Swapping {

	public static void main(String[] args) {

		int[] arr = null;

		arr = new int[5];

		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = i + 1;
			System.out.println(arr[i]);
		}
		int i = 0;
		int j = 2;

		System.out.println(arr[i] + "," + arr[j]);
		// non working swap
		System.out.println("SWAP1");
		swap1(arr[i], arr[j]);
		System.out.println(arr[i] + "," + arr[j]);

		// working swap
		System.out.println("SWAP2");
		swap2(arr, i, j);
		System.out.println(arr[i] + "," + arr[j]);
		
		//hard-coding the value of array	
		int[] other = { 10, 20, 30 };
	
		//non working swap 
		System.out.println("SWAP3");
		System.out.println(arr[0] + "," + other[0]);
		swap3(arr, other);
		System.out.println(arr[0] + "," + other[0]);

	}

	public static void swap1(int one, int two) {

		int temp = one;
		one = two;
		two = temp;
	}

	public static void swap2(int[] arr, int one, int two) {
		System.out.println(arr[one] + "," + arr[two]);
		int temp = arr[one];
		arr[one] = arr[two];
		arr[two] = temp;
	}

	public static void swap3(int[] one, int[] two) {
		int[] temp = one;
		one = two;
		two = temp;
	}

}
