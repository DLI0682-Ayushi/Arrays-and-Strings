package logicaloperators;

import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();
        scanner.close();

        int reversed = reverseNumber(num);
        System.out.println("The reverse of the given number is: " + reversed);
    }

    static int reverseNumber(int num) {
        if (num < 10) {
            return num; // Base case: single-digit number
        }
        int lastDigit = num % 10;
        int remainingDigits = num / 10;
        return lastDigit * (int) Math.pow(10, String.valueOf(remainingDigits).length()) + reverseNumber(remainingDigits);
    }
}
