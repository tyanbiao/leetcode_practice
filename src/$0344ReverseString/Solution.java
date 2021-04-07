package $0344ReverseString;

import edu.princeton.cs.algs4.StdOut;

public class Solution {
    public void reverseString(char[] s) {
        int i = 0, j = s.length - 1;
        while (i < j) {
            s[j] += s[i];
            s[i] = (char)(s[j] - s[i]);
            s[j] -= s[i];
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        char[] s = new char[] {'H', 'e', 'l', 'l', 'o'};
        new Solution().reverseString(s);
        StdOut.println(new String(s));
    }
}
