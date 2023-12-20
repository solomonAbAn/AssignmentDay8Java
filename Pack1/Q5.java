package Pack1;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 5. Implement a recursive Java function to check if a given string is a palindrome.

        // Prompt user for input
        System.out.println("Give me a string:");
        Scanner kb = new Scanner(System.in);
        String input = kb.nextLine();
        kb.close();

        // Check if the input string is a palindrome
        if (isPalindrome(input)) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        // Base case: an empty string or a string with one character is a palindrome
        if (str.length() <= 1) {
            return true;
        } else {
            // Compare the first and last characters, and check the substring in between
            return (str.charAt(0) == str.charAt(str.length() - 1))
                    && isPalindrome(str.substring(1, str.length() - 1));
        }
    }
}
