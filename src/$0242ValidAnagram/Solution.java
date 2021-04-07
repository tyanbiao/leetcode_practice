package $0242ValidAnagram;


import java.util.HashMap;

public class Solution {
    public boolean isAnagram(String s, String t) {
        int m = s.length(), n = t.length();
        if (m != n) return false;
        HashMap<Character, Integer> hash = new HashMap<>();
        for (int i = 0; i < m; i++) {
            char c = s.charAt(i);
            hash.put(c, hash.containsKey(c) ? hash.get(c) + 1 : 1);
        }

        for (int i = 0; i < m; i++) {
            char c = t.charAt(i);
            if (hash.containsKey(c)) {
                int count = hash.get(c);
                if (count == 1) hash.remove(c);
                else hash.put(c, count - 1);
            } else {
                return false;
            }
        }
        return hash.isEmpty();
    }
}
