package Section4ChallengesArrays;

import java.util.Scanner;

public class Employee1 {
	
	String name;
	int salary;
	
	public Employee1(String name, int salary) {
		this.name= name;
		this.salary= salary;
	}
	
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();

		int no = scn.nextInt();

		scn.nextLine();

		Employee1[] arr = new Employee1[no];

		for (int i = 0; i < no; i++) {
			String name = scn.next();
			int salary = scn.nextInt();
			arr[i] = new Employee1(name, salary);
		}

		sortList(arr);

		display(arr, num);
	}

	public static void sortList(Employee1[] arr) {
		for (int counter = 0; counter < arr.length; counter++) {
			for (int j = 0; j < arr.length - 1 - counter; j++) {
				if (arr[j].salary < arr[j + 1].salary) {
					Employee1 temp =  arr[j];    // sort both data types of Employee
					arr[j]= arr[j + 1];
					arr[j + 1] = temp;
				} else if (arr[j].salary == arr[j + 1].salary) {
					if (arr[j].name.compareTo(arr[j + 1].name) > 0) {
						String temp = arr[j].name;
						arr[j].name = arr[j + 1].name;
						arr[j + 1].name = temp;
					}
				}
			}
		}
	}

	public static void display(Employee1[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].salary >= num)
				System.out.println(arr[i].name + " " + arr[i].salary);
		}
	}

}
