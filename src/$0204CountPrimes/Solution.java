package $0204CountPrimes;

public class Solution {
    public int countPrimes(int n) {
        boolean[] notPrimes = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (notPrimes[i]) continue;
            count++;
            for (int j = 2 * i; j < n; j += i) notPrimes[j] = true;
        }
        return count;
    }
}
