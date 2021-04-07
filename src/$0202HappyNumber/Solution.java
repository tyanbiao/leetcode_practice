package $0202HappyNumber;

import edu.princeton.cs.algs4.StdOut;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            sum += Math.pow(n % 10, 2);
            n /= 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = getNext(n);
        }
        return n == 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        StdOut.println(solution.isHappy(19));
    }
}
