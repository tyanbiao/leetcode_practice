package $0350IntersectionOfTwoArraysII;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        int[] res = new int[Math.min(nums1.length, nums2.length)];
        int pos = 0;
        for (int num : nums1) map1.put(num, map1.containsKey(num) ? map1.get(num) + 1 : 1);
        for (int num : nums2) {
            if (map1.containsKey(num) && map1.get(num) > 0) {
                res[pos++] = num;
                map1.put(num, map1.get(num) - 1);
            }
        }
        return Arrays.copyOfRange(res, 0, pos);
    }
}
