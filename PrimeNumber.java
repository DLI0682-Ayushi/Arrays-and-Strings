package logicaloperators;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isPrimeNumber(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
    static boolean isPrimeNumber(int num) {
        if (num <= 1) {
            return false;
        }

        int i = 2;
        while (i <= Math.sqrt(num)) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
