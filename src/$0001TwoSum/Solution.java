package $0001TwoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashmap = new HashMap<>();
        int[] res = {0, 0};
        for (int i = 0; i < nums.length; i++) {
            if (hashmap.containsKey(target - nums[i])) {
                res[0] = i;
                res[1] = hashmap.get(target - nums[i]);
                break;
            } else {
                hashmap.put(nums[i], i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();

    }
}
