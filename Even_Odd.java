package arrayproblrm;
import java.util.Scanner;
public class Even_Odd {
    public static void main(String[] args) {
            int even = 0;
            int odd = 0;
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
            for(int i = 0; i < size; i++) {
                if (array[i] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            System.out.println("Number of even elements: " + even);
            System.out.println("Number of odd elements: " + odd);

        }
    }

