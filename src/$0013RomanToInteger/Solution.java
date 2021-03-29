package $0013RomanToInteger;

public class Solution {

  public int mapNumber(char x) {
    switch (x) {
      case 'I':
        return 1;
      case 'V':
        return 5;
      case 'X':
        return 10;
      case 'L':
        return 50;
      case 'C':
        return 100;
      case 'D':
        return 500;
      case 'M':
        return 1000;
      default:
        return 0;
    }
  }

  public int romanToInt(String s) {
    int res = 0;
    for (int i = 0; i < s.length(); i++) {
      int num = mapNumber(s.charAt(i));
      if (i + 1 < s.length() && num < mapNumber(s.charAt(i + 1))) {
        res -= num;
      } else {
        res += num;
      }
    }
    return res;
  }
  public static void main(String[] args) {
    Solution solution = new Solution();
    int res = solution.romanToInt("MCMXCIV");
    System.out.println(res);
  }
}