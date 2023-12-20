package Pack1;

import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 9. Write a Java recursive method to calculate the product of all numbers in an array.

        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = kb.nextInt();

        int[] array = new int[length];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            array[i] = kb.nextInt();
        }

        long product = calculateProduct(array, 0); // Start with index 0
        System.out.println("Product of all numbers in the array: " + product);

        kb.close();
    }

    public static long calculateProduct(int[] array, int index) {
        // Base case: when the index reaches the end of the array
        if (index == array.length) {
            return 1; // The product of an empty set is 1
        } else {
            // Recursive case: multiply the current element with the product of the remaining elements
            return array[index] * calculateProduct(array, index + 1);
        }
    }
}
