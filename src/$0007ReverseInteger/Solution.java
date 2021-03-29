package $0007ReverseInteger;

public class Solution {
    public int reverse(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        return (int) res == res ? (int)res : 0;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(-214));
    }
}
