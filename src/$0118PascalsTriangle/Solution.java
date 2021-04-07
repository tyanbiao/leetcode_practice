package $0118PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List <List<Integer>> res = new ArrayList<>();
        List<Integer> prevRow = null;
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) row.add(1);
                else row.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            res.add(row);
            prevRow = row;
        }
        return res;
    }
}
