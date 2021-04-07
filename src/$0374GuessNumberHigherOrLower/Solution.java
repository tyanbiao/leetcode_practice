package $0374GuessNumberHigherOrLower;

import edu.princeton.cs.algs4.StdOut;

public class Solution {
    private int target;
    public Solution(int target) {
        this.target = target;
    }

    public int guessNumber(int n) {
        int l = 1, h = n;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            int res = guess(mid);
            if (res == 0) return mid;
            else if (res == -1) h = mid - 1;
            else l = mid + 1;
        }
        return n;
    }

    private int guess(int n) {
        return -Integer.compare(n, target);
    }

    public static void main(String[] args) {
        Solution solution = new Solution(6);
        StdOut.println(solution.guessNumber(10));
    }
}
