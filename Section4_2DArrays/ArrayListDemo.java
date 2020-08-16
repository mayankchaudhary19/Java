package Section4_2DArrays;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		// printing ArrayList
		System.out.println(list);

		// size of ArraylLst
		System.out.println(list.size());

		// Adding an element to the list
		list.add(10);
		System.out.println(list);
		System.out.println(list.size());

		list.add(20);
		System.out.println(list);
		System.out.println(list.size());

		list.add(30);
		System.out.println(list);
		System.out.println(list.size());

		list.add(40);
		System.out.println(list);
		System.out.println(list.size());

		list.add(50);
		System.out.println(list);
		System.out.println(list.size());

		System.out.println("--------------");

		// To get an element at the index of ArrayList
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		// System.out.println(list.get(6));
		
		// since the array at 6 index does not contain any value therefore it will give
		// the error-indexOutOfBoundException though the capacity of the array is 8
		// new Array of size = (2*previous_capacity_of_array);
	
		
		System.out.println("--------------");

		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		System.out.println(list.size());

	}

}
