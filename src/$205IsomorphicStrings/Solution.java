package $205IsomorphicStrings;

import java.util.HashMap;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> s2t = new HashMap<>();
        HashMap<Character, Character> t2s = new HashMap<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char x = s.charAt(i), y = t.charAt(i);
            if (s2t.containsKey(x) && y != s2t.get(x)) return false;
            if (t2s.containsKey(y) && x != t2s.get(y)) return false;
            s2t.put(x, y);
            t2s.put(y, x);
        }
        return true;
    }
}
