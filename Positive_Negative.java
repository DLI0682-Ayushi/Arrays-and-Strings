package arrayproblrm;
import java.util.Scanner;
public class Positive_Negative {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter size of array: ");
                int size = input.nextInt();
                int[] array = new int[size];
                int [] positive = new int[size];
                int [] negative = new int [size];
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
                    if (array[i] >= 0) {
                        positive[i] = array[i];
                    } else
                        negative[i] = array[i];
                }
                System.out.println("Positive array elemets are: " );
                for (int i = 0; i < size; i++) {
                    System.out.print( positive[i]+ " ");
                }
                System.out.println();
                System.out.println("Negative array elemets are: " );
                for (int i = 0; i < size; i++) {
                    System.out.print( negative[i]+ " ");
                }



            }
        }
