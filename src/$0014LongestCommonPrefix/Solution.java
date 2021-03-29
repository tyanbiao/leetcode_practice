package $0014LongestCommonPrefix;

public class Solution {
  public String longestCommonPrefix(String[] strs) {
    String res = strs.length == 0 ? "" : strs[0];
    for (String str: strs) {
      while (!str.startsWith(res)) {
        if (res.length() == 0) return res;
        res = res.substring(0, res.length() - 1);
      }
    }
    return res;
  }
  public static void main(String[] args) {
    Solution solution = new Solution();
    String[] strs = {"flower","flow","flight"};
    System.out.println(solution.longestCommonPrefix(strs));
  }
}
