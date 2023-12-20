package Pack1;

import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 6. Write a recursive Java function to reverse a given string.

  
        Scanner kb = new Scanner(System.in);
        System.out.println("Give me a name, and I will reverse it:");
        String input = kb.nextLine();
        kb.close();

        String reversedString = reverseString(input);
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversedString);
    }

    public static String reverseString(String str) {
       
        if (str.length() <= 1) {
            return str;
        } else {
      
            return str.charAt(str.length() - 1)
                    + reverseString(str.substring(1, str.length() - 1))
                    + str.charAt(0);
        }
    }
}
