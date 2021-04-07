package $0771JewelsAndStones;

import java.util.HashSet;

public class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int len1 = jewels.length(), len2 = stones.length(), count = 0;
        HashSet<Character> set = new HashSet<>(len1);
        for (int i = 0; i < len1; i++) set.add(jewels.charAt(i));
        for (int i = 0; i < len2; i++) {
            if (set.contains(stones.charAt(i))) count++;
        }
        return count;
    }
}
