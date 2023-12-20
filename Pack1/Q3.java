package Pack1;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3. Write a recursive Java function to find the sum of digits of a given
		// positive integer.

		// find
		// sum
		// digits
		// positive int

		Scanner kb = new Scanner(System.in);
        System.out.println("Please enter a positive integer:");
        int number = kb.nextInt();
        int sum = sumOfDigits(number);
        System.out.println("Sum of digits of " + number + " is: " + sum);
        kb.close();
    }

   
    public static int sumOfDigits(int num) {
        if (num == 0) {
            return 0; 
        } else {
            
            return num % 10 + sumOfDigits(num / 10);
            
           
        }
    }
}