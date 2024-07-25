package logicaloperators;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();
        scanner.close();


        if (isPerfectNumber(num)) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }

    // Function to check if a number is a perfect number
    static boolean isPerfectNumber(int num) {
        if (num <= 0) {
            return false; // Not a positive integer
        }

        int divSum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                divSum += i;
            }
        }
        return divSum == num;
    }
}
