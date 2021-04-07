package $1143LongestCommonSubsequence;

import edu.princeton.cs.algs4.StdOut;

public class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        if (text1 == null || text2 == null) return 0;
//        return recursive(text1, text2, text1.length() - 1, text2.length() - 1);
        return dpSolution(text1, text2);
    }

    private int recursive(String s1, String s2, int i, int j) {
        if (i < 0 || j < 0) return 0;
        if (s1.charAt(i) == s2.charAt(j)) return recursive(s1, s2, i - 1, j - 1) + 1;
        else return Math.max(recursive(s1, s2, i - 1, j), recursive(s1, s2, i, j - 1));
    }

    private int dpSolution(String s1, String s2) {
        int l1 = s1.length(), l2 = s2.length();
        int[][] dp = new int[l1][l2];
        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < l2; j++) {
                if (s1.charAt(i) == s2.charAt(j)) dp[i][j] = (i > 0 && j > 0 ? dp[i - 1][j - 1] : 0) + 1;
                else dp[i][j] = Math.max(i > 0 ? dp[i - 1][j] : 0, j > 0 ? dp[i][j - 1] : 0);
            }
        }
        return dp[l1 - 1][l2 -1];
    }

    public static void main(String[] args) {
        String s1 = "pmjghexybyrgzczy", s2 = "hafcdqbgncrcbihkd";
        StdOut.println(new Solution().longestCommonSubsequence(s1, s2));
    }
}
