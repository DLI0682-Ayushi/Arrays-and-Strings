package stringproblems;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
                int[] charIndex = new int[256];
                int maxLen = 0;
                int start = 0;
                for (int end = 0; end < s.length(); end++) {
                    char c = s.charAt(end);
                    if (charIndex[c] >= start) {
                      start = charIndex[c] + 1;
                    }
                    charIndex[c] = end;
                    maxLen = Math.max(maxLen, end - start + 1);
                }

                return maxLen;
            }

            public static void main(String[] args) {
                String inputString = "abcabcbb";
                System.out.println("The length of the longest substring without repeating characters in '" + inputString + "' is " + lengthOfLongestSubstring(inputString));
            }
        }
