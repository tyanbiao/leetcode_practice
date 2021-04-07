package $0387FirstUniqueCharacterInAString;

import java.util.HashMap;

public class Solution {
    public int firstUniqChar(String s) {
        int len = s.length();
        HashMap<Character, Integer> hash = new HashMap<>();
        for (int i = 0; i < len; i++) hash.put(s.charAt(i), hash.containsKey(s.charAt(i)) ? 2 : 1);
        for (int i = 0; i < len; i++) {
            if (hash.containsKey(s.charAt(i)) && hash.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }
}
