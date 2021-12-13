package codility;

public class L2_CyclicRotation {
  // Tested in Codility
  public int[] solution(int[] A, int K) {
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
}
