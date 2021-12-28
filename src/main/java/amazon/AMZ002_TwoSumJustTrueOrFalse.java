package amazon;

import java.util.HashSet;
import java.util.Set;

public class AMZ002_TwoSumJustTrueOrFalse {

  private static boolean findSumOfTwo(int[] numbers, int target) {
    Set<Integer> hs = new HashSet<>();
    Integer diff;

    for (int value : numbers) {
      diff = target - value;
      if (hs.contains(diff)) {
        return true;
      }
      hs.add(value);
    }

    return false;
  }

  public static void main(String[] args) {
    int[] v = new int[] {5, 7, 1, 2, 8, 4, 3};
    int[] test = new int[] {3, 20, 1, 2, 7};

    for (int i = 0; i < test.length; i++) {
      boolean output = findSumOfTwo(v, test[i]);
      System.out.println("findSumOfTwo(v, " + test[i] + ") = " + (output ? "true" : "false"));
    }
  }
}
