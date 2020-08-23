package Section4ChallengesArrays;

import java.util.Scanner;

public class SortGame {
	
	
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();

		int no = scn.nextInt();

		scn.nextLine();

		Employee[] arr = new Employee[no];

		for (int i = 0; i < no; i++) {
			String name = scn.next();
			int salary = scn.nextInt();
			arr[i] = new Employee(name, salary);
		}

		sortList(arr);

		display(arr, num);
	}

	public static void sortList(Employee[] arr) {
		for (int counter = 0; counter < arr.length; counter++) {
			for (int j = 0; j < arr.length - 1 - counter; j++) {
				if (arr[j].Salary < arr[j + 1].Salary) {
					
					Employee temp =  arr[j];    // sort both data types of Employee
					arr[j]= arr[j + 1];
					arr[j + 1] = temp;
					
//					down here I was just updating the salary
//					int temp = arr[j].Salary;
//					arr[j].Salary = arr[j + 1].Salary;
//					arr[j + 1].Salary = temp;
					
				} else if (arr[j].Salary == arr[j + 1].Salary) {
					if (arr[j].Name.compareTo(arr[j + 1].Name) > 0) {
						String temp = arr[j].Name;
						arr[j].Name = arr[j + 1].Name;
						arr[j + 1].Name = temp;
					}
				}
			}
		}
	}

	public static void display(Employee[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].Salary >= num)
				System.out.println(arr[i].Name + " " + arr[i].Salary);
		}
	}

}
