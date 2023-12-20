package Pack1;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//2.	Implement a recursive Java function to find the nth term in the Fibonacci sequence.
		
		Scanner kb = new Scanner (System.in);
		System.out.println("give me a the number of element you want in a fibonacci sequence:");
		int term = kb.nextInt();
		kb.close();
		System.out.println(fibonacci(term));
		
		
	}
	
	
	
	
	public static int fibonacci(int term) {
		
		if (term<=0) {
			return 1;
		}
		else {
			return fibonacci(term-1) + fibonacci(term-2);
		}
		
	}

}
