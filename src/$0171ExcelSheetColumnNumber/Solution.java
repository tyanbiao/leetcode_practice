package $0171ExcelSheetColumnNumber;

import edu.princeton.cs.algs4.StdOut;

public class Solution {
    public int titleToNumber(String columnTitle) {
        int res = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            res = res * 26 + (columnTitle.charAt(i) - 'A' + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        StdOut.println(new Solution().titleToNumber("AB"));
    }
}
