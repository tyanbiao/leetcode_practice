package $0412FizzBuzz;


import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<String> fizzBuzz(int n) {
        int x = 3, y = 5;
        List<String> res = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            if (i == y && i == x) {
                y += 5;
                x += 3;
                res.add("FizzBuzz");
            } else if (i == y) {
                y += 5;
                res.add("Buzz");
            } else if (i == x) {
                x += 3;
                res.add("Fizz");
            } else {
                res.add(Integer.toString(i));
            }
        }
        return res;
    }
}
