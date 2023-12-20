package Pack1;

import java.util.Random;
import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 7. Write a Java recursive method to find the sum of all odd numbers in an array.

        Scanner kb = new Scanner(System.in);
        System.out.println("Give me the array length:");
        int length = kb.nextInt();

        Random rd = new Random();

        int[] array = new int[length];
        int i;

        for (i = 0; i < length; i++) {
            array[i] = rd.nextInt(100) * (rd.nextBoolean() ? 1 : -1); // Generating random numbers between -100 and 100
            System.out.println(array[i]);
        }

        int sum = sumOdd(0, array); // Start with index 0
        System.out.println("Sum of odd numbers: " + sum);

        kb.close();
    }

    public static int sumOdd(int j, int[] array) {
        // Base case: check if the index is at the end of the array
        if (j == array.length) {
            return 0;
        }

        // Check if the current element is odd
        if (array[j] % 2 != 0) {
            System.out.println(array[j] + " is odd");
            // Recursive case: add the current odd element and move to the next index
            return array[j] + sumOdd(j + 1, array);
        } else {
            // Recursive case: move to the next index without adding anything
            return sumOdd(j + 1, array);
        }
    }
}
