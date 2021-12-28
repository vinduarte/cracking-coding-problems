package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  public static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> keyMap = new HashMap<>();
    Map<Integer, Integer> keyMapIndex = new HashMap<>();
    Integer diff;

    for (int i = 0; i < nums.length; i++) {
      diff = target - nums[i];
      if (keyMap.containsKey(diff)) {
        return new int[] {keyMapIndex.get(diff), i};
      }
      keyMap.put(nums[i], diff);
      keyMapIndex.put(nums[i], i);
    }

    return new int[] {};
  }

  public static int[] twoSumBetter(int[] nums, int target) {
    Map<Integer, Integer> keyMap = new HashMap<>();
    Integer diff;

    for (int i = 0; i < nums.length; i++) {
      diff = target - nums[i];
      if (keyMap.containsKey(diff)) {
        return new int[] {keyMap.get(diff), i};
      }
      keyMap.put(nums[i], i);
    }

    return new int[] {};
  }

  public static void main(String[] args) {
    int[] v = new int[] {5, 7, 1, 2, 8, 4, 3};
    int[] test = new int[] {3, 20, 1, 2, 7};

    for (int i = 0; i < test.length; i++) {
      System.out.println(Arrays.toString(twoSumBetter(v, test[i])));
    }
  }
}
