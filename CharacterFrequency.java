package stringproblems;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class CharacterFrequency {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter a string: ");
                String str = input.nextLine();
                Map<Character, Integer> charFrequency = new HashMap<>();

                for (char c : str.toCharArray()) {
                    charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
                }

                for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
                    System.out.println("'" + entry.getKey() + "' appears " + entry.getValue() + " times");
                }
            }
        }
