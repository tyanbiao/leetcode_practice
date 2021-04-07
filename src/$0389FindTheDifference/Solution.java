package $0389FindTheDifference;

public class Solution {
    public char findTheDifference(String s, String t) {
        int sum = 0, len = s.length();
        for (int i = 0; i < len; i++) {
            sum += t.charAt(i);
            sum -= s.charAt(i);
        }
        return (char) (sum + t.charAt(len));
    }
}
