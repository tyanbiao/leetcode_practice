package $0069Sqrt;

public class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        int left = 0, right = x, res = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int tem = x / mid;
            if (tem < mid) {
                right = mid - 1;
            } else if (tem > mid) {
                left = mid + 1;
                res = mid;
            } else {
                return mid;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mySqrt(1));
        // System.out.println(2147395599 / 1073697799);
    }
}
