package $0125ValidPalindrome;

import edu.princeton.cs.algs4.StdOut;

public class Solution {
    public boolean isPalindrome(String s) {
        boolean res = true;
        int start = 0, end = s.length() - 1;
        while (end > start) {
            char charS = s.charAt(start), charE = s.charAt(end);
            if (!valid(charS)) {
                start++;
                continue;
            }
            if (!valid(charE)) {
                end--;
                continue;
            }
            if (Character.toUpperCase(charS) != Character.toUpperCase(charE)) {
                res = false;
                break;
            } else {
                start++;
                end--;
            }
        }
        return res;
    }

    public boolean valid(char c) {
        return (c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        StdOut.println(new Solution().isPalindrome(s));
    }
}
