package Section3Arrays;

public class BasicsOfArray {

	public static void main(String[] args) {
		
		//declare
		int[] arr = null;
		System.out.println(arr);
		
		//allocation [dynamic allocation]
		arr = new int[5];
		System.out.println(arr);	//will return '[' tells array 
									//'I' tells int type of array  then the location of the array
		
		//get
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		//set
		arr[0]= 10;
		arr[1]= 20;
		arr[2]= 30;
		arr[3]= 40;
		arr[4]= 50;
		
		//get
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[arr.length-1]);
		//System.out.println(arr[4]);
		
		//print with for loop
		System.out.println("for loop");
		for (int i= 0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		
		//enhanced for loop
		System.out.println("enhanced for loop");
		for(int val:arr) {
			System.out.println(val);
			val=60;				//only read ,no update
		}
	}

}
