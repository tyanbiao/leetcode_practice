package $0038CountAndSay;

public class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        String str = countAndSay(n - 1);
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i + 1 == str.length() || str.charAt(i) != str.charAt(i + 1)) {
                sb.append(count);
                sb.append(str.charAt(i));
                count = 1;
            } else {
                count++;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countAndSay(5));
    }
}
