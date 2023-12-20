package Pack1;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Write a recursive Java function to calculate the factorial of a given
		// positive integer.

		// given integer
		// positive integer
		Scanner kb = new Scanner(System.in);
		System.out.println("please give me a positive int:");
		int numb = kb.nextInt();
		if (numb < 0) {
			System.out.println("this is not a positive int");
		} else {
			System.out.println(factorial(numb));
		}
		kb.close();

	}

	// recursive: method factorial()
	// factorial

	public static int factorial(int numb) {

		if (numb == 0 || numb == 1) {
			return 1;
		} else {
			return numb * factorial(numb - 1);
		}

	}

}
