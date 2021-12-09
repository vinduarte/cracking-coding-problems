package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> keyMap = new HashMap<>();
        Map<Integer, Integer> keyMapIndex = new HashMap<>();
        Integer diff;

        for (int i = 0; i < nums.length; i++) {
            diff = target - nums[i];
            if (keyMap.containsKey(diff)) {
                return new int[]{keyMapIndex.get(diff), i};
            }
            keyMap.put(nums[i], diff);
            keyMapIndex.put(nums[i], i);
        }

        return new int[]{};
    }
}
