package logicaloperators;
import java.util.Scanner;
public class Fibonacci {
            static void printFibonacci(int N) {
                int num1 = 0, num2 = 1;
                for (int i = 0; i < N; i++) {
                    System.out.print(num1 + " ");
                    int nextNum = num1 + num2;
                    num1 = num2;
                    num2 = nextNum;
                }

            }

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter number till which you want to print fibonacci series: ");
                int N = sc.nextInt();
                printFibonacci(N);
            }
        }
