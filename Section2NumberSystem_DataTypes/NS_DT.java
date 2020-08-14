package Section2NumberSystem_DataTypes;

import java.util.Scanner;

public class NS_DT {

	public static void main(String[] args) {

		part1();
		part2();
		part3();
		part4();
		part5();
		part6();
		part7();
		part7();
		part8();
		part9();
		part10();
		part11();

	}

	private static void part1() {

		byte by = 10;
		short sh = 20;
		int in = 30;
		long ln = 40;

// Though initially all are int but byte(1 byte) can not contaon short(2 byte)
//		by = sh;
//		by = in;
//		by = ln;

		sh = by;
//		sh = in;
//		sh = ln;
//				

		in = by;
		in = sh; // sh contains 10
//		in = ln;

		ln = by;
		ln = sh;
		ln = in;

		System.out.println(in);
	}

	private static void part2() {

		byte by = 10;
		by = 127;

		// by = 128; //will give error compile time error

		by = (byte) 128; // Explicit Conversion

		// NOTE- will hive output as -128 (TOPIC 2.6 //PART 2)

		System.out.println(by);
	}

	private static void part3() {

		int in = 1000000000;

		long ln = 1000000000; // a long can have int

		// ln = 10000000000; //compile time error bcz out of range of int 10^-9 to 10^9

		ln = 10000000000L;// explicit conversion of ln to long

		System.out.println(in);
		System.out.println(ln);
	}

	private static void part4() {

		// Implicit conversion of short and byte works by default for short and byte
		// data type, refer part 5 for better understanding
		short sh = 32000;

		byte by = 13;

		System.out.println(sh);
	}

	private static void part5() {

		// float f-5.5;
		float f = 5.5f; // explicit conversion while in short there is no need to do so
		double db = 6.5;
	}

	private static void part6() {

		System.out.println("\npart6");
		int in;
		float f = 5.5f;

//		int =f;  // error 

		in = (int) f;
		System.out.println(in);

		f = in;
		System.out.println(f);
	}

	static boolean bit = true;

	private static void part7() {

		if (bit) {
			System.out.println("TRUE");
			bit = false;
		} else {
			System.out.println("FALSE");
		}

	}

	public static void part8() {
		int in;
		char ch = 'a';
		System.out.println(ch);
		ch = 99;
		System.out.println(ch);
		in = ch;
		System.out.println(in);

//		ch = ch + 2; // error bcz compiler don't know that ch is not out of range or not

		ch = (char) (ch + 2); // explicit
		System.out.println(ch);

		char ch1 = 64000;
		System.out.println(ch1);

//		ch1=68000;//compile time error : out of range

		ch1 = (char) 680000; // will remove first 16 characters and prinnt any value
		System.out.println(ch1);
	}

	public static void part9() {
		System.out.println(10 + 20 + "Hello" + 10 + 20);
		System.out.println(2 + ' ' + 5); // 2+32+5 32,space : ' '
		System.out.println(2 + "" + 5);
		System.out.println("HELLO" + '\t' + "WORLD"); // \t is tab space
		System.out.println("HELLO" + "\t" + "WORLD");

	}

	public static void part10() {

		int fahrenheit = 0;
		int celsius;

		while (fahrenheit <= 300) {
			// celsius=(5*(fahrenheit-32))/9; //5/9=0 but in ques. it's given that you can't
			// change the formula
			celsius = (int) ((5.0 / 9) * (fahrenheit - 32));// here 5.0 is double and whole double is type-casted into
															// int
			System.out.println(fahrenheit + "\t \t" + celsius);
			fahrenheit += 20;
		}

	}

	public static void part11() {
		// how to take char/string input from user
		Scanner scn = new Scanner(System.in);
		System.out.print("Input :");
		char ch = scn.next().charAt(0); // scn.next() it is used to input string


//		if (ch >= 65 && ch <= 90) {
//			System.out.println("Upper Case");
//		} else if (ch >= 97 && ch <= 122) {
//			System.out.println("Lower Case");
//		} else {
//			System.out.println("Invalid Character");
//		}
		
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println("Upper Case");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println("Lower Case");
		} else {
			System.out.println("Invalid Character");
		}

//		Here we can either use 'A' or 65 in UNICODE/ASCII each char is given a number
	}

 }
