package $0058LengthOfLastWord;

public class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') return s.length() - i - 1;
            if (i == 0) return s.length();
        }
        return 0;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLastWord("heooworld"));
    }
}
