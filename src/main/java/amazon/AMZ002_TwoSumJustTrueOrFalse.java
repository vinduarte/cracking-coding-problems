package amazon;

import java.util.HashSet;
import java.util.Set;

public class AMZ002_TwoSumJustTrueOrFalse {

    private static boolean twoSum(int[] numbers, int target) {

        Set<Integer> hs = new HashSet<>();
        Integer diff;

        for (int value : numbers) {
            diff = Math.abs(value - target);
            if (hs.contains(diff)) {
                return true;
            }
            hs.add(value);
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{5, 7, 1, 2, 8, 4, 3}, 10));
        System.out.println(twoSum(new int[]{5, 7, 1, 2, 8, 4, 3}, 19));
    }
}
