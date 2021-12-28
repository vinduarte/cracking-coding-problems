package codility;

import java.util.Arrays;

public class L2_CyclicRotation {
  // Tested in Codility
  public static int[] solution(int[] A, int K) {
    int size = A.length;

    if (size == 0) {
      return A;
    }

    int realK = K % size;

    if (realK == 0 || size == 1) {
      return A;
    }

    int[] B = new int[size];

    for (int i = 0; i < size; i++) {
      B[(i + realK) % size] = A[i];
    }

    return B;
  }

  public static void main(String[] args) {

    System.out.println(Arrays.toString(solution(new int[] {4, 35, 80, 123}, 3)));
    System.out.println(Arrays.toString(solution(new int[] {4}, 1000000000)));
    System.out.println(Arrays.toString(solution(new int[] {4}, 1)));
    System.out.println(
        Arrays.toString(solution(new int[] {0, 35, 80, 123, 12345, 44, 8, 5, 24, 3, 22, 0}, 3)));
  }
}
