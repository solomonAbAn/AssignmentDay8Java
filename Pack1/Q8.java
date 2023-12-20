package Pack1;

import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 8. Write a Java recursive method to find the length of a given string

        // Example usage
        Scanner kb = new Scanner(System.in);
        System.out.println("Give me a name:");
        String name = kb.next();
        int length = findLength(name);
        System.out.println("Length of the string \"" + name + "\": " + length);
        kb.close();
    }

    public static int findLength(String str) {
        // Base case: an empty string has length 0
        if (str.isEmpty()) {
            return 0;
        } else {
            // Recursive case: add 1 for the current character and move to the next substring
            return 1 + findLength(str.substring(1));
        }
    }
}
