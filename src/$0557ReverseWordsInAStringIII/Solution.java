package $0557ReverseWordsInAStringIII;

import edu.princeton.cs.algs4.StdOut;

public class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(), subSB = new StringBuilder();
        int i = 0, len = s.length();
        while (i < len) {
            if (s.charAt(i) == ' ') {
                if (subSB.length() > 0) {
                    sb.append(subSB.reverse().toString());
                    subSB = new StringBuilder();
                }
                sb.append(s.charAt(i));
            } else {
                subSB.append(s.charAt(i));
            }
            i++;
        }
        if (subSB.length() > 0) sb.append(subSB.reverse().toString());
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        Solution solution = new Solution();
        StdOut.println(solution.reverseWords(s));
    }
}
