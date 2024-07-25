package arrayproblrm;
import java.util.Scanner;
public class AverageOfSum {
    public static void main(String[] args) {

        int sum = 0;
        int average;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.print("Enter elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("You created a new array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        average = sum / size;
        System.out.println("The average is: " + average);
        System.out.println("The sum is: " + sum);
    }
}
