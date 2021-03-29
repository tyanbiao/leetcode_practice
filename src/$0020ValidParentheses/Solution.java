package $0020ValidParentheses;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
  public boolean isValid(String s) {
    Deque<Integer> stack = new LinkedList<>();
    for (int i = 0; i < s.length(); i++) {
      int x = s.charAt(i);
      if (x == '{' || x == '[' || x == '(' || stack.size() == 0) {
        stack.push(x);
      } else {
        int l = stack.pop();
        if (!isPaired(x, l)) {
          stack.push(l);
          stack.push(x);
        }
      }
    }
    return stack.size() == 0;
  }
  public boolean isPaired(int x, int l) {
    return 
    (l == '[' && x == ']') || 
    (l == '{' && x == '}') ||
    (l == '(' && x == ')');
  }
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.isValid("]"));
  }
}
