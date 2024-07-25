package stringproblems;

public class Palindrom {
    public static void main(String[] args) {
                String str = "madam" ;
                int left = 0;
                int right = str.length() -1;
                boolean isPalindrome = true;
                while (left < right) {
                    if (str.charAt(left) != str.charAt(right)) {
                        System.out.println("not palindrom");
                        isPalindrome = false;
                        break;
                    }
                    left++;
                    right--;
                }
                if (isPalindrome) {
                    System.out.println("palindrome");
                }

            }
        }
