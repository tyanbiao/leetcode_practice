package $0009PalindromeNumber;

public class Solution {
    public int reverse(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        return (int) res == res ? (int) res : 0;
    }
  
    public boolean isPalindrome(int x) {
        return x >= 0 && x == this.reverse(x);
    }
  
}
