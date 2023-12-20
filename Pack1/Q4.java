package Pack1;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 4. Create a recursive Java function to calculate the power of a number (base^exponent).

        Scanner kb = new Scanner(System.in);

        System.out.println("Give me the base:");
        int base = kb.nextInt();

        System.out.println("Give me the exponent:");
        int exponent = kb.nextInt();

        kb.close();

        System.out.println(power(base, exponent));
    }

    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1; 
        }

        if (base == 0) {
            return 0; 
        }

        
        return base * power(base, exponent - 1);
    }
}
